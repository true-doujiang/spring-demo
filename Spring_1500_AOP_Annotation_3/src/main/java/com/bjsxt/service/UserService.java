package com.bjsxt.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


@Component("userService")
public class UserService { //implements IUserService
	
	private UserDAO userDAO;  

	
	public void add(User user) {
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
