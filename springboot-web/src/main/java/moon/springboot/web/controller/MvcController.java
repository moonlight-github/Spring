package moon.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import moon.springboot.web.entity.User;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午3:46:31 
* 类说明 :
*/

@RestController
public class MvcController {

	@GetMapping("/mvc/getuser")
	public User getUser() {
		User user = new User();
		user.setName("古乃亮");
		user.setAddress("荔园新村");
		return user;
	}
}
