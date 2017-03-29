package com.springboot.spring4.executor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.springboot.spring4.executor")
@EnableAsync//1 开启异步任务支持
public class ExecutorConfig implements AsyncConfigurer{

	/**
	 * 重写 getAsyncExecutor 返回一个ThreadPoolTaskExecutor
	 * 获取到了基于线程池的 executor 
	 */
	@Override
	public Executor getAsyncExecutor() {
		// TODO Auto-generated method stub
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);//线程池维护线程的最少数量
		taskExecutor.setMaxPoolSize(10);//线程池维护线程的最大数量
		taskExecutor.setQueueCapacity(25);//线程池所使用的缓冲队列
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
