package com.springboot.spring4.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name="注解式拦截的add 操作")
	public void add(){};
}
