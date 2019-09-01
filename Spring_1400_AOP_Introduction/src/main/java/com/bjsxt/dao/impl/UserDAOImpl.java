package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

/**
 * 被代理对象角色
 * @author Yhh
 *
 */
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
	}

	public void delete(String str) {
		//System.out.println(str);
		System.out.println("user deteleted");
		
	}

}
