package com.springboot.spring4.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	
	@Bean
	@Profile("zqp")
	public DemoBean ddBean(){
		return new DemoBean("zqp");
	}
	
	
	@Bean
	@Profile("ly")
	public DemoBean lyBean(){
		return new DemoBean("ly");
	}
	
	
	
}
