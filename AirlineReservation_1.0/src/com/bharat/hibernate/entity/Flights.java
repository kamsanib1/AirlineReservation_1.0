package com.bharat.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flights {

	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn
	private FlightModels flightModels;
	@ManyToOne
	@JoinColumn
	private Airlines airlines;
	@OneToMany(mappedBy="flight")
	private Collection<Schedules> schedules = new ArrayList<Schedules>();
	
	public Collection<Schedules> getSchedules() {
		return schedules;
	}
	public void setSchedules(Collection<Schedules> schedules) {
		this.schedules = schedules;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public FlightModels getModelId() {
		return flightModels;
	}
	public Airlines getAirlinesId() {
		return airlines;
	}
	public void setModelId(FlightModels flightModels) {
		this.flightModels = flightModels;
	}
	public void setAirlinesId(Airlines airlines) {
		this.airlines = airlines;
	}
	
}
