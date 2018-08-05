package moon.springboot.web.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import moon.springboot.web.servlet.MyServlet02;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月5日 下午9:50:28 
* 类说明 :
*/
@Configuration
public class ServletConfig {
	
	// 配置一个servlet
	/**
	 * @return
	 */
	@Bean
	public ServletRegistrationBean<MyServlet02> getServletRegistrationBean() {
		return new ServletRegistrationBean<MyServlet02>(new MyServlet02(), "/myservlet02");
	}

}
