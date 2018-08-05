package moon.springboot.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import moon.springboot.java.service.UserService;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月5日 下午10:56:37 
* 类说明 :
*/

@SpringBootApplication
public class JavaApplication01 {
	

	
	public static void main(String[] args) {
		// 获取到spring容器
		ConfigurableApplicationContext ctx = SpringApplication.run(JavaApplication01.class, args);
		
		UserService userService = ctx.getBean("userServiceImpl",UserService.class);
		String out = userService.sayHi("古乃亮");
		System.out.println(out);
		
		
	}

}
