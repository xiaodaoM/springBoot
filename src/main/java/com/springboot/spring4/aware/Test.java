package com.springboot.spring4.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		
		AwareService bean = context.getBean(AwareService.class);
		bean.ouputResult();
		context.close();
	}
}
