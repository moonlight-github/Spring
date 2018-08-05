package moon.springboot.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import moon.springboot.web.interceptor.LoginInterceptor;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年8月5日 下午9:06:42 类说明 :
 */
@Configuration
public class WebInterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
				.addPathPatterns("/web/**", "/mvc/**","/myservlet01/**") // 要拦截的路径
				.excludePathPatterns("/web/test") // 不拦截的路径
		;
	}
}
