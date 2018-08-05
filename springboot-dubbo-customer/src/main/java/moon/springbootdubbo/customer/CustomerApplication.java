package moon.springbootdubbo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月3日 上午12:06:26 
* 类说明 :
*/

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})//关闭数据库的配置
@EnableDubboConfiguration
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
}
