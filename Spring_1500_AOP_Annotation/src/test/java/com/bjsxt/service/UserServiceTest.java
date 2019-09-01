package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	//加入aspectj框架的2个jar包（专门用来产生动态代理的框架）
//	@Test
//	public void testAdd() throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		UserService service = (UserService)ctx.getBean("userService");
//		
//		User user = new User();
//		service.add(user);
//		//service.addUser(user);
//	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		
		User user = new User();
		service.add(user);
		//service.addUser(user);
	}

}
