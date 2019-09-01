package com.bjsxt.service;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;



public class UserService {
	
	private UserDAO userDAO;

	public UserService() {
        System.out.println("实例化 UserService. 在init()之前执行，肯定的啊，对象不能存在怎么肯执行init()");
    }

	
	public void add(User user) {
		//System.out.println("add user");
		userDAO.save(user);
	}
	
	//初始化方法
	public void initxml() {
		System.out.println("initxml");
	}

	//销毁，关闭方法
	public void destroyxml2() {
		System.out.println("destroyxml2");
	}
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
