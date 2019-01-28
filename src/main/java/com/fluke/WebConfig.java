package com.fluke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fluke.component.AdtorpInterceptor;

@Configuration 
public class WebConfig implements WebMvcConfigurer{

	@Autowired
	AdtorpInterceptor adtorpInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(adtorpInterceptor);
	}

	
}
