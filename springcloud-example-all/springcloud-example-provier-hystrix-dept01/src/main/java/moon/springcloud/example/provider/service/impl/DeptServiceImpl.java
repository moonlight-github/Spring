package moon.springcloud.example.provider.service.impl;
/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月20日 下午10:39:26 
* 类说明 :
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moon.springcloud.example.api.entity.Dept;
import moon.springcloud.example.provider.dao.DeptMapper;
import moon.springcloud.example.provider.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptMapper mapper;

	@Override
	public boolean add(Dept dept) {
		return mapper.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return mapper.findById(id);
	}

	@Override
	public List<Dept> list() {
		return mapper.findAll();
	}

}
