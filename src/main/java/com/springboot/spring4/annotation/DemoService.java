package com.springboot.spring4.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	
	public void outputResult(){
		System.out.println("从组合配置中一样获取bean");
	}
}
