package com.ust.MVCConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.ust.Controllers"})
public class MyConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver iv = new InternalResourceViewResolver();
		iv.setPrefix("/");
		iv.setSuffix(".jsp");
		return iv;

	}

}
