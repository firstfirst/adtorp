package com.fluke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.fluke.component.AdtorpFilter;

@Configuration 
@EnableWebSecurity 
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired AdtorpFilter adtorpFilter;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable().authorizeRequests()
				.antMatchers("/*").permitAll()
				.and()
				.addFilter(adtorpFilter)
			;
	}

}
