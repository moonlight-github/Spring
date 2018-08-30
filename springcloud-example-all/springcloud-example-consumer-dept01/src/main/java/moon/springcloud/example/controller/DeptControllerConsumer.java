package moon.springcloud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import moon.springcloud.example.api.entity.Dept;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月21日 下午9:06:44 
* 类说明 :
*/
@RestController
public class DeptControllerConsumer {

	@Autowired
	private RestTemplate rest;
	
//	private static final String REST_URL_PREFIX = "http://127.0.0.1:8010";
	//微服务节点地址：不需要具体端口的IP了
	private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-EXAMPLE-PROVIER";
	
	
	@PostMapping("/dept/add")
	public boolean add(Dept dept) {
		return rest.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return rest.getForObject(REST_URL_PREFIX+"/dept/get/" + id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/dept/list")
	public List<Dept> list(){
		return rest.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
	
	
	@GetMapping("/dept/client")
	public Object client() {
		return rest.getForObject(REST_URL_PREFIX+"/dept/client", Object.class);
	}
}
