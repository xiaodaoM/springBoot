package com.springboot.spring4.prepost;

public class BeanWayService {

	
	public void init(){
		System.out.println("@bean -init -method");
	}

	public BeanWayService() {
		super();
		System.out.println("��ʼ�����췽������beanway service");
	}
	
	public void despory(){
		System.out.println("@bean -despory-method");
	}
	
	

}
