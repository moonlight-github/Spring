package moon.springcloud.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月20日 下午10:51:06 
* 类说明 :
*/

@SpringBootApplication
@EnableEurekaClient//服务注册
@EnableDiscoveryClient//服务发现
public class ProviderDeptApp8010 {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDeptApp8010.class, args);
	}
}
