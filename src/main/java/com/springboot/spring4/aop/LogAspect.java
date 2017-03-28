package com.springboot.spring4.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	
	@Pointcut("@annotation(com.springboot.spring4.aop.Action)")
	public void annotationPointCut(){};
	
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinpoint){
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截："+ action.name());
		
	}
	
	@Before("execution(* com.springboot.spring4.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinpoint){
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		
		System.out.println("方法式拦截："+method.getName());
		
	}
}
