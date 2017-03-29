package com.springboot.spring4.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestBeanConfig.class})//用来加载application 配置类.class
@ActiveProfiles("zqp")//用来声明 活动的profile 
public class Main {
	
	@Autowired
	private TestBean testBean;

	@Test
	public void test(){
		
		String a = "zqp";
		
		Assert.assertEquals(a, testBean.getContent());
	}
}
