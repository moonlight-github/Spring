package moon.springboot.web.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import moon.springboot.web.filter.MyFilter02;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月5日 下午10:12:52 
* 类说明 :
*/

@Configuration
public class FilterConfig {
	
	@Bean
	public FilterRegistrationBean<MyFilter02> getFilter(){
		FilterRegistrationBean<MyFilter02> filter = new FilterRegistrationBean<MyFilter02>();
		filter.setFilter(new MyFilter02());
		filter.addUrlPatterns("/*");
		return filter;
	}
	
	// 设置字符编码（需要将spring.http.encoding.enabled=false才会生效
	
	@Bean
	public FilterRegistrationBean<CharacterEncodingFilter> getEncodingFilter(){
		
		//或者在启动类中直接扫描org.springframework.web.filter.CharacterEncodingFilter.class
		
		FilterRegistrationBean<CharacterEncodingFilter> filter = new FilterRegistrationBean<CharacterEncodingFilter>();
		
		CharacterEncodingFilter charFilter = new CharacterEncodingFilter();
		charFilter.setEncoding("GBK");
		charFilter.setForceEncoding(true);
		
		filter.setFilter(charFilter);
		filter.addUrlPatterns("/*");
		return filter;
	}

}
