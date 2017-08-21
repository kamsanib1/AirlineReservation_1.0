package com.bharat.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bharat.hibernate.entity.*;
import com.bharat.hibernate.bussiness.*;

public class HibernateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userMgr = new UserManager();
		System.out.println(userMgr.verifyUser("jaya", "pass"));
	}

}
