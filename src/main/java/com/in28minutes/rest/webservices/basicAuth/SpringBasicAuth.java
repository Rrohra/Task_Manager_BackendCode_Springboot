package com.in28minutes.rest.webservices.basicAuth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration      //tells spring configuration is present
@EnableWebSecurity  //tells that web security is enabled
public class SpringBasicAuth extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests((requests) -> {
		requests.antMatchers(HttpMethod.OPTIONS,"/**").permitAll();//allow unauthenticated request for options from all urls
		requests.anyRequest().authenticated(); //allow everything
		});

		http.httpBasic();   //just use HTpp basic
		http.csrf().disable();   //disbales csrf
		
		//http.formLogin(); //disbale formLogin
		
		
	}

}
