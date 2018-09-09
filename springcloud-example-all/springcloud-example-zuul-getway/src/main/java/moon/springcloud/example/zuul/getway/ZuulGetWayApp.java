package moon.springcloud.example.zuul.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年9月2日 下午8:49:09 
* 类说明 :
*/

@SpringBootApplication
@EnableZuulProxy
public class ZuulGetWayApp {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGetWayApp.class, args);
	}
}
