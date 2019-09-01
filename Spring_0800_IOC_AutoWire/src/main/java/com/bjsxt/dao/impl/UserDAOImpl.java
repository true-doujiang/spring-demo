package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


public class UserDAOImpl implements UserDAO {
	
	//只是用于标示
	private int daoId;
	
	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user saved!");
	}
	
	public int getDaoId() {
		return daoId;
	}
	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}
	
	
	@Override
	public String toString() {
		return "daoId=" + daoId;
	}

}
