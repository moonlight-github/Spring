package moon.springboot.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 上午9:08:07 
* 类说明 :
*/

@Configuration
public class RedisConfig {
	
	
//	@Bean
//	public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory factory){
//		
//		RedisTemplate<Object,Object> template = new RedisTemplate<>(factorys);
//		
//		// 配置相关的参数：序列化的方案
//		template.setKeySerializer(new StringRedisSerializer());
//		
//		return template;
//	}

}
