package com.springboot.spring4.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
			
		DemoPushlish bean = context.getBean(DemoPushlish.class);
		bean.push("hello event");

		context.close();
	}
}
