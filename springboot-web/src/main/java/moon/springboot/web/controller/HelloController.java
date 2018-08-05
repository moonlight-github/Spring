package moon.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午3:36:57 
* 类说明 :采用的是类似于spring一样的controller
*/

@Controller
@RequestMapping("/web")
public class HelloController {	
	
	
	
	@RequestMapping("/hello")
	@ResponseBody//Json返回
	public String hello() {
		return "Hello StringBoot-Web";
	}
	@RequestMapping("/test")
	@ResponseBody//Json返回
	public String test() {
		return "Hello StringBoot-Web:test";
	}

}
