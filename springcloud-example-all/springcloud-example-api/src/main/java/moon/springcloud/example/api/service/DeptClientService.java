package moon.springcloud.example.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import moon.springcloud.example.api.entity.Dept;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月20日 下午10:38:01 
* 类说明 :使用feign来实现负载均衡服务调用
*/
//@FeignClient(value = "SPRINGCLOUD-EXAMPLE-PROVIER")
@FeignClient(value = "SPRINGCLOUD-EXAMPLE-PROVIER",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@PostMapping("/dept/add")
	public boolean add(Dept dept);
	
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) ;
	
	@GetMapping("/dept/list")
	public List<Dept> list();
	
	@GetMapping("/dept/client")
	public Object client();
}
