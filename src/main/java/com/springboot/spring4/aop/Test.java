package com.springboot.spring4.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
			DemoAnnotationService bean = context.getBean(DemoAnnotationService.class);
			
			bean.add();
			DemoMethodService bean2 = context.getBean(DemoMethodService.class);
			bean2.add();
			context.close();
	}

}
