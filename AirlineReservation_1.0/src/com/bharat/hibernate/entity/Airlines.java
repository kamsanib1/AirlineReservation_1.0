package com.bharat.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Airlines {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(mappedBy="airlines")
	private Collection<Flights> flights = new ArrayList<Flights>();
	
	public Collection<Flights> getFlights() {
		return flights;
	}
	public void setFlights(Collection<Flights> flights) {
		this.flights = flights;
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
	
}
