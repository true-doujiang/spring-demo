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
		
		/*当我的UserService类实现IUserService接口时，
		 * 就不需要cglib.jar了，拿到的好像还是代理对象啊
		 */
		//IUserService service2 =  (IUserService) ctx.getBean("userService");
		UserService service =  (UserService) ctx.getBean("userService");
		
		//测试,service是代理对象
		//System.out.println(service.getClass());
		
		service.add(new User());
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		/*当我的UserService类实现IUserService接口时，
		 * 就不需要cglib.jar了，拿到的好像还是代理对象啊
		 */
		//IUserService service2 =  (IUserService) ctx.getBean("userService");
		UserService service =  (UserService) ctx.getBean("userService");
		
		//测试,service是代理对象
		//System.out.println(service.getClass());
		
		service.add(new User());
	}

}
