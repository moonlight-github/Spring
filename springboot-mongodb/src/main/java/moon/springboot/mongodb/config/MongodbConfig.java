package moon.springboot.mongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午3:18:18 
* 类说明 :
*/

@Configuration
@PropertySource({"classpath:data-source.properties"})//指定配置文件
@EnableMongoRepositories(basePackages = "moon.springboot.mongodb.repository")
public class MongodbConfig /*extends AbstractMongoConfiguration*/{
	
	/*@Autowired	
	private Environment env;

	@Bean
	@Override
	public MongoClient mongoClient() {
		ServerAddress ser = new ServerAddress(env.getRequiredProperty("mongo.host"));
		List<MongoCredential> cre = new ArrayList<>();
		return new MongoClient(ser,cre);
	}

	@Override
	protected String getDatabaseName() {
		return env.getRequiredProperty("mongo.name");
		
	}*/
	
	

}
