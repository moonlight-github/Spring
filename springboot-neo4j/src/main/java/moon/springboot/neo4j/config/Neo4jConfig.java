package moon.springboot.neo4j.config;

import org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月26日 上午12:01:48 
* 类说明 :
*/

@Configuration
@EnableTransactionManagement
@EnableNeo4jRepositories(basePackages = {"moon.springboot.neo4j.repository"})
public class Neo4jConfig extends Neo4jDataAutoConfiguration{

}
