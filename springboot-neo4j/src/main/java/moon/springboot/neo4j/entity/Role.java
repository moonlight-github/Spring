package moon.springboot.neo4j.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年7月23日 下午10:17:50 类说明 :
 */

@JsonIdentityInfo(generator = JSOGGenerator.class)
@RelationshipEntity(type = "ACTS_IN")
public class Role {

	/**
	 * ID
	 */
	@GraphId
	private Long id;
	/**
	 * 角色名称
	 */
	private String role;
	
	/**
	 * 演员
	 */
	@StartNode
	private Actor actor;
	
	/**
	 * 电影
	 */
	@EndNode
	private Movie movie;

	public Role() {
	}

	/**
	 * 
	 * @param actor 演员
	 * @param movie 电影
	 * @param name 角色名称
	 */
	public Role(Actor actor, Movie movie, String name) {
		this.actor = actor;
		this.movie = movie;
		this.role = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "(Role [id=" + id + ", role=" + role + ", actor=" + actor + "])";
	}

	
}
