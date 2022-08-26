package com.akshay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan( {"com.akshay"} )  //this will replace the akshay-servlet class
public class AkshayConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {    //here we can specify that we are using jsp and no need to mention jsp extension in contollers
														    //so that in future when we change the view tech we will make changes here only
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		//bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/");
		bean.setSuffix(".jsp");

		return bean;
	}
}
