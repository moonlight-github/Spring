package moon.springcloud.example.provider.service;

import java.util.List;

import moon.springcloud.example.api.entity.Dept;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月20日 下午10:38:01 
* 类说明 :
*/

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
