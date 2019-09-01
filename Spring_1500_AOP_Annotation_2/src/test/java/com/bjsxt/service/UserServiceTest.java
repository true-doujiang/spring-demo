package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.aop.LogInterceptor;
import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		
		String result = service.add(new User());
		System.out.println(result);
		
		//LogInterceptor loginterceptor = (LogInterceptor)ctx.getBean("logInterceptor");
		//System.out.println(loginterceptor); 
	}
	
	

}
