package moon.springboot.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午3:30:01 
* 类说明 :自定义的一些参数
*/

@Component//便于注解扫描到
@ConfigurationProperties(prefix = "mywcfg")
public class MyWebConfig {

	
	private String name;
	
	
	private String address;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
