package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	private int LID;
	private String name;
	
	// Default constructor
	public Laptop() { }

	// Parameterized constructor
	public Laptop(int LID, String name) {
		this.LID = LID;
		this.name = name;
	}

	// Getters and setters
	public int getLID() {
		return LID;
	}

	public void setLID(int LID) {
		this.LID = LID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Laptop [LID=" + LID + ", Name=" + name + "]";
	}
}
