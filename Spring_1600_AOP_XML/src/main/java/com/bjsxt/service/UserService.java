package com.bjsxt.service;
import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


@Component("userService")
public class UserService{
	
	private UserDAO userDAO;  
	
	public void add(User user) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		userDAO.save(user);
	}
	
		
	@Resource(name="u")  //在容器里找叫u的那个bean
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}


}
