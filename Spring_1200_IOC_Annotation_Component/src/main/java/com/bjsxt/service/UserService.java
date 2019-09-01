package com.bjsxt.service;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

/*
	By default, classes annotated with @Component, @Repository, @Service, or @Controller 
	(or classes annotated with a custom annotation that itself is annotated with @Component) 
	are the only detected candidate components. 
 	在spring2.5.6这个版本中这4个注释是同一个意思，想区分开的但是还没有区分开而已。
 */

//@Component("userService")
//@Controller
//@Repository   repository	英[rɪˈpɒzətri] 仓库; 贮藏室; 博物馆;

@Service
public class UserService {
	
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
