package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	//本工程新加hibernate的jar包，具体的jar可以看hibernate视频
	
	@Test 
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		
		User user = new User();
		user.setUsername("哈哈123");
		user.setPassword("ppppp");
		service.add(user);
	}

}
