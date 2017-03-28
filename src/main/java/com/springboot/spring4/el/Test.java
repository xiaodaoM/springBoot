package com.springboot.spring4.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
		
		ElConfig bean = context.getBean(ElConfig.class);
		bean.outputResource();
		context.close();
		
		
	}
}
