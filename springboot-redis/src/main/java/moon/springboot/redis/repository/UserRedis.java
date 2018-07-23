package moon.springboot.redis.repository;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import moon.springboot.redis.entity.User;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年7月23日 上午9:29:52 类说明 :
 */

@Repository
public class UserRedis {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public void add(String key, Long time, User user) {
		Gson gson = new Gson();
		redisTemplate.opsForValue().set(key, gson.toJson(user), time, TimeUnit.MINUTES);
	}

	public void add(String key, Long time, List<User> users) {
		Gson gson = new Gson();
		redisTemplate.opsForValue().set(key, gson.toJson(users), time, TimeUnit.MINUTES);
	}

	public User get(String key) {
		String userJson = redisTemplate.opsForValue().get(key);
		if (!StringUtils.isEmpty(userJson)) {
			Gson gson = new Gson();
			return gson.fromJson(userJson, User.class);
		}
		return null;
	}

	public List<User> getUsers(String key) {
		String userJson = redisTemplate.opsForValue().get(key);
		if (!StringUtils.isEmpty(userJson)) {
			Gson gson = new Gson();
			return gson.fromJson(userJson, new TypeToken<List<User>>(){}.getType());
		}
		return null;
	}

}
