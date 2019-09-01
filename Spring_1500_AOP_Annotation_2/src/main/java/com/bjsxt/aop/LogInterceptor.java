package com.bjsxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
	/*
	 * 定义了一个切入点集合，名字是方法名myMethod，其他的切入点可以引用
	 */
	@Pointcut("execution(public * com.bjsxt.dao..*.*(..))")
	public void myMethod(){};
	
	/*@Pointcut("execution(public * com.bjsxt.dao..*.*(..))")
	public void myajax(){};*/
	
	//引用上面的切入点语法
//	@Before("myMethod()")
//	public void before() {
//		System.out.println("method before");
//	}
	
	//引用上面的切入点语法
	@Around("myMethod()")	//使用@Around 要给方法加个参数ProceedingJoinPoint
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("method around start");
		
		//责任链模式
		Object result = pjp.proceed(); //这句调用的是com.bjsxt.dao..*.*(..) 里的方法
		
		System.out.println("method around end");
		
		return result;
	}
	
}
