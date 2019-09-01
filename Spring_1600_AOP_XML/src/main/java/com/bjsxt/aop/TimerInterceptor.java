package com.bjsxt.aop;


public class TimerInterceptor {
	
	long start = 0;
	long end = 0;
	
	public void startTime() {
		start = System.currentTimeMillis();
		System.out.println("method startTime");
	}
	
	public void endTime() {
		end = System.currentTimeMillis();
		System.out.println("method endTime  共使用了: " + ((end - start)/1000) + "s");
	}
	
}
