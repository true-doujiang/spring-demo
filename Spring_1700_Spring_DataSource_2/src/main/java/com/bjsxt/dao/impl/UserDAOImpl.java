package com.bjsxt.dao.impl;


import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


@Component("userDAOImpl") 
public class UserDAOImpl implements UserDAO {
	
	/*
	 * 上一次的dataSource不要了
	 * dataSource在bean.xml里注入到了sessionFactory里，
	 * sessionFactory有注入到了这里
	 */
	private SessionFactory sessionFactory;

	
	public void save(User user) {
		//class org.hibernate.impl.SessionFactoryImpl   并不是XML里配置的那个AnnotationSessionFactoryBean
	    System.out.println("session factory class:" + sessionFactory.getClass()); //class org.hibernate.impl.SessionFactoryImpl
		Session s = sessionFactory.openSession(); //getCurrentSession();现在用不了
		
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		
		System.out.println("user saved!");
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}	

}
