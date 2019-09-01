package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


public class UserDAOImpl implements UserDAO {
	
	private UserDAOImpl() {
		System.out.println("实例化UserDAOImpl， 懒加载");
	}

	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user saved!");
	}

}
