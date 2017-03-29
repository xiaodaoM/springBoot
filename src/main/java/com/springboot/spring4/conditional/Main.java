package com.springboot.spring4.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		ListService bean = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+""
				+ "系统下的列表命令为"+bean.showListCmd());
	}
}
