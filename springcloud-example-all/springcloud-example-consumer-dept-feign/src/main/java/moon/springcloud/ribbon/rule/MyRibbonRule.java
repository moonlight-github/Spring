package moon.springcloud.ribbon.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月27日 下午10:49:05 
* 类说明 :
*/
@Configuration
public class MyRibbonRule{
	
	@Bean//自定义负载均衡的算法
	public IRule myRule() {
		return new MyRibbonRuleDemo();
//		return new RetryRule();
	}

}
