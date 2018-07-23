package moon.springboot.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import moon.springboot.mongodb.entity.User;
import moon.springboot.mongodb.repository.UserRepository;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午7:32:15 
* 类说明 :
*/
@RestController
public class MongoController {
	
	@Autowired
	UserRepository ur;
	
	@GetMapping("/mongo/findall")
	public List<User> findAll(){
		List<User> users = ur.findAll();
		return users;
	}
	
	@GetMapping("/mongo/save")
	public String save(){
		User user = new User();
		user.setName("古乃亮");
		user.setUserId("32494");
		user.setEmail("534064620@qq.com");
		ur.save(user);
		return "保存成功";
	}
	
	
	

}
