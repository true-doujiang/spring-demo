package com.bjsxt.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl implements UserDAO {
	
	private Properties adminEmails; //属性文件
	private Set<String> sets;
	private List<String> lists;     //数组同list
	private String[] strs;          //数组同list
	private Map<String , String> maps;
	
	public UserDAOImpl() { }

	public void save(User user) {
		System.out.println("user saved!");
	}
	
	
	public Properties getAdminEmails() {
		return adminEmails;
	}
	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}
	
	public Set<String> getSets() {
		return sets;
	}
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	
	public String[] getStrs() {
		return strs;
	}
	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
	@Override
	public String toString() {
		return "sets size:" + sets.size() + "| lists size:" + lists.size() + "|strs.length:" + strs.length + "| maps size:" + maps.size() ; 
	}

}
