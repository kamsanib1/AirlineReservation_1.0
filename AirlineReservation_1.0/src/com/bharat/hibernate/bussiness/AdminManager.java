package com.bharat.hibernate.bussiness;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bharat.hibernate.entity.Admins;

public class AdminManager {

	public void addAdmin(Admins admin){
		Session session = SessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		session.close();
	}
	
	public void addAdmin(String username, String password){
		Admins admin = new Admins();
		admin.setUsername(username);
		admin.setPassword(password);
		addAdmin(admin);
	}
	
	public boolean verifyAdmin(String username, String password){
		System.out.println("Admin manager:Before opening Session");
		Session session = SessionManager.getSessionFactory().openSession();
		System.out.println("Admin manager:After opening Session");
		session.beginTransaction();
		
		Query query = session.createQuery("from Admins where username=? and password=?");
		query.setString(0, username)
			 .setString(1, password);
		List<Admins> users = (List<Admins>) query.list();
		
		session.close();

		return !users.isEmpty();
	}

}
