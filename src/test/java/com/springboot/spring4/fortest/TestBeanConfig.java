package com.springboot.spring4.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestBeanConfig {

	@Bean
	@Profile("dev")
	public TestBean dev(){
		
		return new TestBean("dev");
	}
	
	@Bean
	@Profile("zqp")
	public TestBean zqp(){
		
		return new TestBean("zqp");
	}
	
	

	
	
	
}
