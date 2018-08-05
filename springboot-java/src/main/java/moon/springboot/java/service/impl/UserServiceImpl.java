package moon.springboot.java.service.impl;
/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月5日 下午10:58:00 
* 类说明 :
*/

import org.springframework.stereotype.Service;

import moon.springboot.java.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String sayHi(String name) {
		
		return "Hi : " + name;
	}

}
