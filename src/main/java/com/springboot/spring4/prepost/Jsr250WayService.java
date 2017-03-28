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
		System.out.println("��ʼ�� jsr250 ���췽��");
	}
	@PreDestroy
	public  void despory(){
		
		System.out.println("jsr 250 ����");
	}
	
	
}
