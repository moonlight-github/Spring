package moon.springcloud.example.api.service;

import java.util.List;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import moon.springcloud.example.api.entity.Dept;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年9月1日 上午11:19:43 
* 类说明 :统一的熔断
*/
@Component// 不能忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable arg0) {
		// 后台服务出错的话，统一写替代方法处理
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				return new Dept().setDeptno(id)
						.setDname("该ID："+id+"没有对应的信息,Consumer客户端地宫的降级信息，此时服务Provider不可用")
						.setDb_source("没有数据库信息");
			}
			
			@Override
			public Object client() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
