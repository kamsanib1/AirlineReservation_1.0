package com.bharat.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservations {

	@Id @GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn
	private Users user;
	@ManyToOne
	@JoinColumn
	private Schedules schedule;
	private String classType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Schedules getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedules schedule) {
		this.schedule = schedule;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	
}
