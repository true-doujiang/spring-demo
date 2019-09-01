package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {
	
	//spring常使用dbcp连接池   添加3个jar包
	//mysql-connector-java-5.1.7-bin.jar、、
	//commons-pool.jar
	//commons-dbcp.jar
	
	@Test 
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		
		User user = new User();
		service.add(user);
		
		ctx.destroy();
	}

}
