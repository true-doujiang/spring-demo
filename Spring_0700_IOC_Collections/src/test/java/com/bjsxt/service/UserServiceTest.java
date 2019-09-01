package com.bjsxt.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bjsxt.dao.impl.UserDAOImpl;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserDAOImpl u1 = (UserDAOImpl)ctx.getBean("userDAO");
		System.out.println(u1); 
		
		System.out.println(u1.getAdminEmails().getProperty("administrator"));
	}

}
