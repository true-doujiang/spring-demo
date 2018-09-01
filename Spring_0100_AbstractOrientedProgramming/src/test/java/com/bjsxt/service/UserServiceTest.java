package com.bjsxt.service;

import org.junit.Test;

import com.bjsxt.model.User;
import com.bjsxt.spring.BeanFactory;
import com.bjsxt.spring.ClassPathXmlApplicationContext;


public class UserServiceTest {
	
	/* spring2.0没有annotation，2.5有annotation */
	@Test
	public void testAdd() throws Exception {
		
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		UserService service = (UserService)applicationContext.getBean("userService");
		//原始的new方式
		//UserService service = new UserService();

		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		
		service.add(u);
	}
}
