package com.bjsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

//使用这个注释不需要加入新的jar
@Component("userService")
public class UserService {
	
	private UserDAO userDAO;  
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	//使用这个注释不需要加入新的jar
	
	//Qualifier 合格，限定
	@Autowired    //Autowired是按byType注入，又因为bean.xml写了2个u、u2所以加了@Qualifier("u")
	public void setUserDAO(UserDAO userDAO) {   //@Qualifier("u") UserDAO userDAO
		this.userDAO = userDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}


}
