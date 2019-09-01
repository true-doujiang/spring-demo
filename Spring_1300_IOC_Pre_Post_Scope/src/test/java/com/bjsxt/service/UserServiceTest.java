package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		UserService service2 = (UserService)ctx.getBean("userService");

		System.out.println(service == service2);
		service.add(new User());
		
		//init-method destroy-methd 不要和prototype一起用（了解）
		ctx.destroy();
	}

}
