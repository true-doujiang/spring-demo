package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.stereotype.Component;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


@Component(value="u")	
public class UserDAOImpl implements UserDAO {
	
	//javax.sql.DataSource  是土鳖sun定义的接口，所有数据库的驱动都得实现它（实现getConnection() ），
	//这样我调用getConnection时拿到的就是真正的数据库连接
	private DataSource dataSource;
	
	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public DataSource getDataSource() {
		return dataSource;
	}


	public void save(User user) {
		try {
			//dataSource：接口，数据库驱动都要实现它，通过它拿到数据库的链接，sun公司的标准,
			Connection conn = dataSource.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate("insert into user values(null,'马云','123')");
			statement.close();
			conn.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("user saved!");
	}

}
