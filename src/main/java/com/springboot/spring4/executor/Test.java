package com.springboot.spring4.executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExecutorConfig.class);

		AsyncTaskService bean = context.getBean(AsyncTaskService.class);

		for (int i = 0; i < 10; i++) {

			bean.executeAsync(i);
			bean.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}
