package moon.springcloud.ribbon.rule;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年8月28日 下午8:42:02 类说明 : 自定义的每个服务调用5次
 */

public class MyRibbonRuleDemo extends AbstractLoadBalancerRule {
	private AtomicInteger nextServerCyclicCounter;
	
	private AtomicInteger repeatCounter;
	
	private volatile int currentIndex = 0;
	
	private final static int REPEAT_COUNT = 5;

	private static Logger log = LoggerFactory.getLogger(MyRibbonRuleDemo.class);

	public MyRibbonRuleDemo() {
		nextServerCyclicCounter = new AtomicInteger(0);
		repeatCounter = new AtomicInteger(0);
	}

	public MyRibbonRuleDemo(ILoadBalancer lb) {
		this();
		setLoadBalancer(lb);
	}

	public Server choose(ILoadBalancer lb, Object key) {
		if (lb == null) {
			log.warn("no load balancer");
			return null;
		}

		Server server = null;
		int count = 0;
		while (server == null && count++ < 10) {
			List<Server> reachableServers = lb.getReachableServers();
			List<Server> allServers = lb.getAllServers();
			int upCount = reachableServers.size();
			int serverCount = allServers.size();

			if ((upCount == 0) || (serverCount == 0)) {
				log.warn("No up servers available from load balancer: " + lb);
				return null;
			}

			int nextServerIndex = incrementAndGetModulo(serverCount);
			server = allServers.get(nextServerIndex);

			if (server == null) {
				/* Transient. */
				Thread.yield();
				continue;
			}

			if (server.isAlive() && (server.isReadyToServe())) {
				return (server);
			}

			// Next.
			server = null;
		}

		if (count >= 10) {
			log.warn("No available alive servers after 10 tries from load balancer: " + lb);
		}
		return server;
	}

	/**
	 * Inspired by the implementation of {@link AtomicInteger#incrementAndGet()}.
	 *
	 * @param modulo
	 *            The modulo to bound the value of the counter.
	 * @return The next value.
	 */
	private int incrementAndGetModulo(int modulo) {
		// 先判断是否调有REPEAT_COUNT次了
		int now = repeatCounter.incrementAndGet();
		int flag = now % REPEAT_COUNT;
		
		if(flag!=1) {
			return currentIndex;
		}
		
		
		for (;;) {
			int current = nextServerCyclicCounter.get();
			int next = (current + 1) % modulo;
			if (nextServerCyclicCounter.compareAndSet(current, next)) {
				currentIndex = next;
				return next;
			}
		}
	}

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
	}
}
