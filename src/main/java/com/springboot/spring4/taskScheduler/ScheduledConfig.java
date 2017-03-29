package com.springboot.spring4.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.springboot.spring4.taskScheduler")
@EnableScheduling//1 启用..
public class ScheduledConfig {

}
