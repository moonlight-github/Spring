package moon.springboot.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import moon.springboot.java.service.UserService;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月5日 下午11:11:55 
* 类说明 :非Web项目的启动方式二
*/
@SpringBootApplication
public class JavaApplication02 implements CommandLineRunner{

	
	// 纯java程序的入口
	@Override
	public void run(String... args) throws Exception {
		
		String sayHi = userService.sayHi("古乃亮");
		System.out.println(sayHi);
	}
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaApplication02.class, args);
	}

}
