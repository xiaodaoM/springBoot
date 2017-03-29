package com.springboot.spring4.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	
	
	@Bean
	@Conditional(WindowCondition.class)//符合windows　的用windows
	public ListService windows(){
		return new WindowsListService();
		
	}
	@Bean
	@Conditional(LiunxCondition.class)//符合linux 的用linux  
	public ListService linux(){
		return new LiunxListService();
		
	}
	
	

}
