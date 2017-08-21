package com.bharat.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class FlightModels {

	@Id
	@GeneratedValue
	private int id;
	private String manufacturer;
	private String name;
	private int bClass;
	private int eClass;
	@OneToMany(mappedBy="flightModels")
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getbClass() {
		return bClass;
	}
	public void setbClass(int bClass) {
		this.bClass = bClass;
	}
	public int geteClass() {
		return eClass;
	}
	public void seteClass(int eClass) {
		this.eClass = eClass;
	}
	
	
}
