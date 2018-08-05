package moon.springboot.neo4j.entity;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午10:17:38 
* 类说明 :电影
*/

@JsonIdentityInfo(generator = JSOGGenerator.class)
@NodeEntity
public class Movie {
	/**
	 * ID
	 */
	@GraphId
	private Long id;
	/**
	 * 标题
	 */
	private String title;
    /**
     * 年份
     */
	private String year;

	/**
	 * 角色
	 */
    @Relationship(type="ACTS_IN", direction = Relationship.DIRECTION)
    private List<Role> roles = new ArrayList<>();

    /**
     * 增加角色
     * @param actor 演员
     * @param name
     * @return
     */
    public Role addRole(Actor actor, String name){
        Role role = new Role(actor,this,name);
        this.roles.add(role);
        return role;
    }
    
    

    public Movie() { }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public List<Role> getRoles() {
		return roles;
	}



	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}



	@Override
	public String toString() {
		return "(Movie [id=" + id + ", title=" + title + ", year=" + year + ", roles=" + roles + "])";
	}

   

}
