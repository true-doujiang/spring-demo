package com.bjsxt.service;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.bjsxt.aop.LogInterceptor;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;
import com.bjsxt.spring.BeanFactory;
import com.bjsxt.spring.ClassPathXmlApplicationContext;


public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		UserService service = (UserService)applicationContext.getBean("userService");
		
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}
	
	@Test
	public void testProxy() {
		
		//被代理的对象
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor handler = new LogInterceptor();
		handler.setTarget(userDAO);
		/**
		 * 产生代理对象
		 * 第一个参数：代理对象使用与被代理对象同样的ClassLoader
		 * 第二个参数：代理对象实现与被代理对象同样的接口
		 * 第三个参数：产生的代理对象调用方法时，有谁处理
		 * 返回的代理对象实现了UserDAO接口，所以返回的是UserDAO
		 */
		UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(
								 userDAO.getClass().getClassLoader(),
								 userDAO.getClass().getInterfaces(),
								 handler);
		
		//System.out.println(userDAOProxy.getClass());
		userDAOProxy.delete("delete");
		userDAOProxy.save(new User());
	}
}
