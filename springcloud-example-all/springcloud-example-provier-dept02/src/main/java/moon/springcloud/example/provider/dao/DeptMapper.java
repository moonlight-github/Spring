package moon.springcloud.example.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import moon.springcloud.example.api.entity.Dept;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月20日 下午10:32:08 
* 类说明 :
*/
@Mapper
public interface DeptMapper {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
