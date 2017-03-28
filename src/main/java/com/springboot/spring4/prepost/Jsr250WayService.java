package com.springboot.spring4.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jsr250WayService {

	@PostConstruct
	public void init(){
		System.out.println("jsr250 - init -method");
	}

	public Jsr250WayService() {
		super();
		System.out.println("初始化 jsr250 构造方法");
	}
	@PreDestroy
	public  void despory(){
		
		System.out.println("jsr 250 销毁");
	}
	
	
}
