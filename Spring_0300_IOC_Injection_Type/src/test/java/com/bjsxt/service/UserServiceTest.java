package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.User;

import java.util.ArrayList;
import java.util.List;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		UserService service2 = (UserService)ctx.getBean("userService");
		
		System.out.println(service == service2);
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);

        List<String> list = new ArrayList<String>();
        list.stream().forEach(x -> {
            System.out.println(x);
        });
	}

}
