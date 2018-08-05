package moon.springboot.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import moon.springboot.neo4j.entity.Actor;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午10:42:56 
* 类说明 :
*/

@Repository
public interface ActorRepository extends Neo4jRepository<Actor, Long>{

}
