package moon.springboot.redis.controller;
/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午12:52:33 
* 类说明 :
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import moon.springboot.redis.entity.User;
import moon.springboot.redis.repository.UserRedis;

@RestController
public class RedisController {
	
	@Autowired
	private UserRedis redis;
	
	@GetMapping("/redis/adduser/{key}")
	public String addUser(@PathVariable("key")String key) {
		User user = new User();
		user.setId(32494L);
		user.setName("古乃亮");
		user.setCreatedate(new Date());
		redis.add(key, 5L, user);
		return "保存成功";
	}
	
	@GetMapping("/redis/getuser/{key}")
	public User getUser(@PathVariable("key")String key) {
		return redis.get(key);
	}
	
	@GetMapping("/redis/getusers/{key}")
	public List<User> getUsers(@PathVariable("key")String key) {
		return redis.getUsers(key);
	}
	@GetMapping("/redis/addusers/{key}")
	public String addUsers(@PathVariable("key")String key) {
		User user01 = new User();
		user01.setId(32494L);
		user01.setName("古乃亮01");
		user01.setCreatedate(new Date());
		
		User user02 = new User();
		user02.setId(32494L);
		user02.setName("古乃亮02");
		user02.setCreatedate(new Date());
		
		List<User> users = new ArrayList<>();
		users.add(user01);
		users.add(user02);
		redis.add(key, 5L, users);
		
		return "保存成功";
	}
	

}
