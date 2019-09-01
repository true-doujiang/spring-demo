package com.bjsxt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

@Component("userService")
public class UserService {
	
	private UserDAO userDAO;  
	
	public void add(User user) {
		System.out.println(userDAO.getClass());
		userDAO.save(user);
	}
	
	//@Resource 资源，可以指定使用的资源名字。
	//不指定名字的话，默认按名字ByName,不是类型自动装配.
	//名字找不到时就按类型ByType
	@Resource(name="u")    //name="u" 可以不指定       默认就是按照属性名注入的
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
}
