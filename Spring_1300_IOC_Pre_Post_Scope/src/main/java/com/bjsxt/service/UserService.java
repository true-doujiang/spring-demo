package com.bjsxt.service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

//@Scope("prototype")
@Component("userService")
public class UserService {
	
	private UserDAO userDAO;  
	
	
	public UserService() {
		System.out.println("构造方法先执行");  
	}

	//初始化方法
	@PostConstruct    //= init-method
	public void init() {
		System.out.println("init");
	}
	
	//容器销毁之前执行
	@PreDestroy		//= destroy-method
	public void destroy() {
		System.out.println("destroy");
	}
	
	
	public void add(User user) {
		userDAO.save(user);
	}
	
		
	@Resource(name="u")  
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}

}
