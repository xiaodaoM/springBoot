package com.springboot.spring4.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name="ע��ʽ���ص�add ����")
	public void add(){};
}
