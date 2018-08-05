package moon.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午4:01:56 
* 类说明 :
*/

@SpringBootApplication// 标记为springboot项目：自动扫描同级或下级路径中的controler
//指定要扫描的servlet,filter包路径
@ServletComponentScan(basePackages = {"moon.springboot.web.servlet","moon.springboot.web.filter"}) 
public class WebApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
