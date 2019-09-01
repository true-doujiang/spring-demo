package com.bjsxt.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 切面类,新增的逻辑
 * @author Yhh
 *
 */

//使用动态代理注释语法必须在bean.xml中配 <aop:aspectj-autoproxy />
@Aspect		//@Aspect 切面   与Advice的概念类似,Advice指的是切面上的逻辑，例如@before.....
@Component	//本类也必须要spring进行初始化
public class LogInterceptor {
	
	/* 这里就是切入点（JoinPoint），多个切入点集合就是切入点集合@Pointcut
	 * @Before(aspectj的before) 有自己的语法，告诉spring在哪个方法(这个方法必须是spring管理的)之前执行before()方法
	 */
	@Before("execution(public void com.bjsxt.dao.impl.UserDAOImpl.save(com.bjsxt.model.User))")
	public void before() {
		System.out.println("method before");
	}
	
	//@AfterThrowing 抛异常后就执行，不过异常一般不再spring里处理，一般在struts2里处理，方便给页面。
	
	//@AfterReturning 方法正常执行完后就是执行@AfterReturning
	//@After 方法执行后(即使有异常)一定会执行@After
	@AfterReturning("execution(public * com.bjsxt.dao..*.*(..))")  //只记住这一种语法就够了
	public void afterReturning() {
		System.out.println("method after");
	}
	
}
