package com.springboot.spring4.taskScheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)//1 每5秒执行一次
	public void reportCurrenttime(){
		System.out.println("每5秒执行一次:"+sdf.format(new Date()));
	}
	
	@Scheduled(cron ="0 40 10 ? * *")
	public void fixTime(){
		System.out.println("在指定的 :"+sdf.format(new Date())+"执行");
	}
}
