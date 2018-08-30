package moon.springcloud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import moon.springcloud.example.api.entity.Dept;
import moon.springcloud.example.api.service.DeptClientService;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月21日 下午9:06:44 
* 类说明 :
*/
@RestController
public class DeptControllerConsumer {

	@Autowired
	private DeptClientService ser;
	
	
	@PostMapping("/dept/add")
	public boolean add(Dept dept) {
		return ser.add(dept);
	}
	
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return ser.get(id);
	}
	
	@GetMapping("/dept/list")
	public List<Dept> list(){
		return ser.list();
	}
	
	
	@GetMapping("/dept/client")
	public Object client() {
		return ser.client();
	}
	@GetMapping("/dept/test")
	public Dept test() {
		return new Dept("test");
	}
}
