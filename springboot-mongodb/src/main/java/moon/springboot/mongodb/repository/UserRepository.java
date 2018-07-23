package moon.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import moon.springboot.mongodb.entity.User;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月23日 下午3:09:45 
* 类说明 :
*/
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
