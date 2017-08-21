package com.bharat.hibernate.bussiness;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager {
	private static SessionFactory sf = null;
	public static SessionFactory getSessionFactory(){
		
		if(sf==null){
			System.out.println("Session Manager: building configuration...");
			sf = new Configuration().configure().buildSessionFactory();
			System.out.println("Session Manager: configuration finished. session factory ready.");
		}
		return sf;
	} 
}
