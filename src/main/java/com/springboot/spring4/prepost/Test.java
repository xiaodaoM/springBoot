
package com.springboot.spring4.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService bean = context.getBean(BeanWayService.class);
		Jsr250WayService bean2 = context.getBean(Jsr250WayService.class);
		context.close();
	}
}
