package com.springboot.spring4.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	
	@Async//异步方法
	public void executeAsync(Integer i){
		System.out.println("执行异步任务: "+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("执行异步任务:+1 "+(i+1));
	}
}
