package com.bjsxt.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 日志逻辑类
 * @author Yhh
 */
//代理对象必须实现一个接口，否则JDK产生不了代理对象
public class LogInterceptor implements InvocationHandler {
	
	//被代理的对象
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	//新加的业务逻辑
	public void beforeMethod(Method m) {
		System.out.println(m.getName() + " start");
	}
	//新加的业务逻辑
	public void afterMethod(Method m) {
		System.out.println(m.getName() + " end");
	}
	

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		
		beforeMethod(m);
		Object obj = m.invoke(target, args); 
		afterMethod(m);
		
		return obj;
	}
}
