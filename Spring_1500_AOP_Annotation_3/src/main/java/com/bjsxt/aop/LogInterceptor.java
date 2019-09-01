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
	
	//这里要给service层产生动态代理，
	//而service层有没有实现接口，所以需要借助cglib.jar操作二进制码产生代理对象
	@Pointcut("execution(public * com.bjsxt.service..*.add(..))")
	public void myMethod(){};
	

	
	@Around("myMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("method around start");
		
		pjp.proceed();
		
		System.out.println("method around end");
	}
	
}
