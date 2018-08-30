package moon.springcloud.example.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月21日 下午8:55:16 
* 类说明 :
*/
@Configuration
public class ConfigBean {

	
	//封装了多种便捷的Http访问服务
	@Bean
	@LoadBalanced//使用负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean//自定义负载均衡的算法
	public IRule myRule() {
		return new RetryRule();
	}
	
	
}
