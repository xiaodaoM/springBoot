package com.springboot.spring4.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
@Component
public class AwareService implements BeanNameAware,ResourceLoaderAware{

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.loader = resourceLoader;
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		
	}
	
	public void ouputResult(){
		System.out.println("Bean 的名称:"+ beanName);
		Resource resource = loader.getResource("classpath:com/springboot/spring4/aware/test.txt");
		
		try {
			System.out.println("resource 加载内容为"+ IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
