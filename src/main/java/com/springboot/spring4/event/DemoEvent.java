package com.springboot.spring4.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg  = msg;
		// TODO Auto-generated constructor stub
	}

	private String msg;


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
