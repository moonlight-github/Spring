package moon.springboot.jpa.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月19日 下午11:33:01 
* 类说明 :
*/

@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration//配置类
@EnableTransactionManagement(proxyTargetClass = true)// 开启事务
@EnableJpaRepositories(basePackages = "moon.springboot.jpa.jpa")//开启Jpa
@EntityScan(basePackages = "moon.springboot.jpa.entity")//实体类扫描
public class JpaConfiguration {
	
	//  配置相关的Bean
	
	
	

}
