package moon.springcloud.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月22日 下午10:41:05 
* 类说明 :
*/
@SpringBootApplication
@EnableEurekaServer//开启服务
public class EurekaServerApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
	}
}
