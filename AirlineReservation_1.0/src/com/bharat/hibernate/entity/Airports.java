package com.bharat.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airports {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Location location;
	@OneToMany(mappedBy="srcAirport")
	private Collection<Schedules> srcSchedule = new ArrayList<Schedules>();
	@OneToMany(mappedBy="destAirport")
	private Collection<Schedules> destSchedule = new ArrayList<Schedules>();
	
	public Collection<Schedules> getSrcSchedule() {
		return srcSchedule;
	}
	public void setSrcSchedule(Collection<Schedules> srcSchedule) {
		this.srcSchedule = srcSchedule;
	}
	public Collection<Schedules> getDestSchedule() {
		return destSchedule;
	}
	public void setDestSchedule(Collection<Schedules> destSchedule) {
		this.destSchedule = destSchedule;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
}
