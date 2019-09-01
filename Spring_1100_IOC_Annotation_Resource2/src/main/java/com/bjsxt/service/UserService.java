package com.bjsxt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

@Component
public class UserService {
	
	private UserDAO userDAO;
	private UserDAO userDAO2;  
	
	public void add(User user) {

		System.out.println(userDAO.getClass());
		userDAO.save(user);
		
		System.out.println(userDAO2.getClass());
		userDAO2.save(user);
	}
	
	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource
	public void setUserDAO2(UserDAO userDAO2) {
		this.userDAO2 = userDAO2;
	}
	public UserDAO getUserDAO2() {
		return userDAO2;
	}
	
	
}
