package com.bharat.hibernate.bussiness;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bharat.hibernate.entity.Users;

public class UserManager {
	
	private int maxCount;
	
	public void addUser(Users user){
		Session session = SessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
	
	public void addUser(String username, String password){
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		addUser(user);
	}
	
	public boolean verifyUser(String username, String password){
		System.out.println("User manager:Before opening Session");
		Session session = SessionManager.getSessionFactory().openSession();
		System.out.println("User manager:After opening Session");
		session.beginTransaction();
		
		Query query = session.createQuery("from Users where username=? and password=?");
		query.setString(0, username)
			 .setString(1, password);
		List<Users> users = (List<Users>) query.list();
		
		session.close();

		
		return !users.isEmpty();
		

	}
	
	public List<Users> getUsersList(int count){
		Session session = SessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Users");
		query.setMaxResults(count);
		List<Users> users = (List<Users>) query.list();
		
		session.close();
		
		return users;
		
	}
}
