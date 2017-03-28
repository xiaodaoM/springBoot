package com.springboot.spring4.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springboot.spring4.prepost")
public class PrePostConfig {
	
	@Bean(initMethod="init",destroyMethod="despory")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	Jsr250WayService jsr250WayService(){
		return new Jsr250WayService();
	}

	
	
}
