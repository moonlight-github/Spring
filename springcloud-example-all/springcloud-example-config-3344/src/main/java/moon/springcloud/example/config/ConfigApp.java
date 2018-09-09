package moon.springcloud.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年9月9日 下午7:38:40 
* 类说明 :
*/

@SpringBootApplication
@EnableConfigServer
public class ConfigApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigApp.class, args);
	}

}
