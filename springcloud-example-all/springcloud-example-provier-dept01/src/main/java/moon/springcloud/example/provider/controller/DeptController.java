package moon.springcloud.example.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import moon.springcloud.example.api.entity.Dept;
import moon.springcloud.example.provider.service.DeptService;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月20日 下午10:43:48 
* 类说明 :
*/


@RestController//rest风格
public class DeptController {
	
	
	
	@Autowired
	private DiscoveryClient client;

	@Autowired
	private DeptService ser;
	
	@PostMapping("/dept/add")
	public boolean add(@RequestBody Dept dept) {
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
	
	/**
	 * 服务的发现
	 * @return
	 */
	@GetMapping("/dept/client")
	public Object client() {
		// 获取到所有的服务
		List<String> info = client.getServices();
		
		System.out.println("********" + info);
		List<ServiceInstance> sers = client.getInstances("SPRINGCLOUD-EXAMPLE-PROVIER");
		for (ServiceInstance ser : sers) {
			System.out.println(ser.getServiceId() + "\t" + ser.getHost() + "\t" + ser.getPort() + "\t" + ser.getUri());
		}
		
		
		
		return this.client;
	}
}
