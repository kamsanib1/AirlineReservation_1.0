package com.bharat.hibernate.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Schedules {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn
	private Flights flight;
	@ManyToOne
	@JoinColumn
	private Airports srcAirport;
	@ManyToOne
	@JoinColumn
	private Airports destAirport;
	@OneToMany(mappedBy="schedule")
	private Collection<Reservations> reservations = new ArrayList<Reservations>();
	private Time time;
	private Date date;
	private int bClass;
	private int eClass;
	private float journeyTime;
	
	
	public Collection<Reservations> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservations> reservations) {
		this.reservations = reservations;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Flights getFlight() {
		return flight;
	}
	public void setFlight(Flights flight) {
		this.flight = flight;
	}
	public Airports getSrcAirport() {
		return srcAirport;
	}
	public void setSrcAirport(Airports srcAirport) {
		this.srcAirport = srcAirport;
	}
	public Airports getDestAirport() {
		return destAirport;
	}
	public void setDestAirport(Airports destAirport) {
		this.destAirport = destAirport;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public float getJourneyTime() {
		return journeyTime;
	}
	public void setJourneyTime(float journeyTime) {
		this.journeyTime = journeyTime;
	}
	
	
	
}
