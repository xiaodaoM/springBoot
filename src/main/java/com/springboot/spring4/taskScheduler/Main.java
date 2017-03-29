package com.springboot.spring4.taskScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new  AnnotationConfigApplicationContext(ScheduledConfig.class);
		
//		ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
	}
}
