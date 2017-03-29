package com.springboot.spring4.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mian {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context
		 = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		DemoService bean = context.getBean(DemoService.class);
		bean.outputResult();
		context.close();
	}
}
