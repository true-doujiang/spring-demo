package com.bjsxt.dao;
import com.bjsxt.model.User;


public interface UserDAO {
	public void save(User user);
	public void delete(String str);
}
