package com.bjsxt.dao.impl;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

//把本类的实例化对象当做一个组件使用，u是实例化对象的名字
@Component(value="u")	//value可以省略
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user saved!");
	}
	
	public void addUser(User user){
		//int i = 1/0;  //测试@After一定会执行
		System.out.println("add user  我不加aop");
	}
}
