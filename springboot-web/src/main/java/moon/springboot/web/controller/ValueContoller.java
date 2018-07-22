package moon.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import moon.springboot.web.config.MyWebConfig;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午3:50:07 
* 类说明 :获取自定义参数
*/

@RestController
public class ValueContoller {
	
	@Value("${mywcfg.name}")
	private String name;
	
	@Value("${mywcfg.address}")
	private String address;
	
	@Autowired
	private MyWebConfig myWebConfig;
	
	
	@GetMapping("/value/getcfg01")
	public String getMyWebConfig01() {
		return "name=" + name + "，address=" + address;
	}
	
	@GetMapping("/value/getcfg02")
	public String getMyWebConfig02() {
		return "name=" + myWebConfig.getName() + "，address=" + myWebConfig.getAddress();
	}

}
