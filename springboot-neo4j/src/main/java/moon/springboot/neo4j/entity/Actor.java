package moon.springboot.neo4j.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年7月23日 下午10:15:48 
 * 类说明 :演员类
 */

@JsonIdentityInfo(generator = JSOGGenerator.class)
@NodeEntity
public class Actor {

	/**
	 * ID
	 */
	@GraphId
	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 出生年
	 */
	private int born;

	public Actor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	@Override
	public String toString() {
		return "(Actor [id=" + id + ", name=" + name + ", born=" + born + "])";
	}


	
}
