package com.bjsxt.service;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;



public class UserService {
	
	private UserDAO userDAO2;  //
	
	public void add(User user) {
		userDAO2.save(user);
	}
	
	
	public UserDAO getUserDAO() {
		return userDAO2;
	}
	public void setUserDAO2(UserDAO userDAO) {
		this.userDAO2 = userDAO;
	}
	
	

	
	
}
