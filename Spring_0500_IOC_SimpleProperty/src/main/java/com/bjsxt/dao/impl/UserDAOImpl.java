package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl implements UserDAO {
	
	
	private int daoId;
	private String daoStatus;
	
	
	public UserDAOImpl() { }

	public UserDAOImpl(int daoId, String daoStatus) {
		System.out.println("构造方法注入daoId=" + daoId + " daoStatus=" + daoStatus);
		this.daoId = daoId;
		this.daoStatus = daoStatus;
	}

	public void save(User user) {
		System.out.println("user saved!");
	}
	
	public int getDaoId() {
		return daoId;
	}
	public void setDaoId(int daoId) { 
		System.out.println("setDaoId " + daoId);
		this.daoId = daoId;
	}

	public String getDaoStatus() {
		return daoStatus;
	}
	public void setDaoStatus(String daoStatus) {
		System.out.println("setDaoStatus " + daoStatus); 
		this.daoStatus = daoStatus;
	}
}
