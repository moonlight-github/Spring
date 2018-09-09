package moon.springboot.example.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年9月2日 下午2:57:33 
* 类说明 :
*/

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApp {
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApp.class, args);
	}

}
