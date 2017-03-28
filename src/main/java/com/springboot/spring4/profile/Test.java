package com.springboot.spring4.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
		context.getEnvironment().setActiveProfiles("ly");
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean bean = context.getBean(DemoBean.class);
		System.out.println(bean.getContent());
		context.close();
	}
}
