package com.springboot.spring4.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.springboot.spring4.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
