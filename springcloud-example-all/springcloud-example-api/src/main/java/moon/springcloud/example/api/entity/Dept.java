package moon.springcloud.example.api.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年8月19日 下午10:14:43 类说明 :
 */

@SuppressWarnings("serial")
@NoArgsConstructor//无参构造
@Data//get set方法
@Accessors(chain=true)  //链式调用
public class Dept implements Serializable{

	/**
	 * 主键
	 */
	private Long deptno;
	/**
	 * 部门名称
	 */
	private String dname;
	/**
	 * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	 */
	private String db_source;
	
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}

	
}
