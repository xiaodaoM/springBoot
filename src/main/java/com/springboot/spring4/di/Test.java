package com.springboot.spring4.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
			UseFunctionService bean = context.getBean(UseFunctionService.class);
			System.out.println(bean.sayHello("zqp come on"));
			context.close();
		}
}
