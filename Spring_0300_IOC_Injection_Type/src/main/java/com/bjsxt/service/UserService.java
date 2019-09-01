package com.bjsxt.service;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


public class UserService {
	
	private UserDAO userDAO;  
	
	//添加构造方法就可以在bean.xml里使用构造方法注入
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
		System.out.println("create userSservice");
	}
	
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	
	//xml文件使用构造方法注入时，这里可以不加set、get方法
/*	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		System.out.println("set");
		this.userDAO = userDAO;
	}*/
	

}
