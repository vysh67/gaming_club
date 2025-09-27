package com.dscasc.Gaming.Club.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="collections")
public class Collection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date;
	private double amount;
	
	
	public Collection() {}
	
	public Collection(LocalDate date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
