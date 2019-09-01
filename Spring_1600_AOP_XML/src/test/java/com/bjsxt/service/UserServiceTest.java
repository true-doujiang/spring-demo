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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) ctx.getBean("userService");
		
		//测试,service是代理对象
		//System.out.println(service.getClass());
		
		service.add(new User());
	}

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) ctx.getBean("userService");

        //测试,service是代理对象
        System.out.println(service.getClass()); //com.bjsxt.service.UserService$$EnhancerByCGLIB$$62ba164e

        service.add(new User());
    }

}
