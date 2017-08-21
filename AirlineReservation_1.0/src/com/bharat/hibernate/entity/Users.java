package com.bharat.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	@Id
	private String username;
	private String password;
	private String fname;
	private String lname;
	private String mailid;
	@OneToMany(mappedBy="user")
	private Collection<Reservations> reservations = new ArrayList<Reservations>();
	
	public Collection<Reservations> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservations> reservations) {
		this.reservations = reservations;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
}

