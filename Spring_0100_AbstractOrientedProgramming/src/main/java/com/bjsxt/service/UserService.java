package com.bjsxt.service;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;



public class UserService {
	
	//这里调用的是接口就是面向接口编程，而不是直接调用某个实现类
	//这个接口(UserDAO)的实现可以是MySQLUserDaoImpl,也可以是OracleUserDaoImpl
	//好处就是灵活
	private UserDAO userDAO;  
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
