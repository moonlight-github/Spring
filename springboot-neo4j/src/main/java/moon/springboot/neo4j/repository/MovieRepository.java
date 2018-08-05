package moon.springboot.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import moon.springboot.neo4j.entity.Movie;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午10:50:20 
* 类说明 :
*/

@Repository
public interface MovieRepository extends Neo4jRepository<Movie, Long>{

	public Movie findByTitle(@Param("title")String title);
}
