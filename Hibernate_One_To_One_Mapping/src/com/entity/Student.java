package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Student {
	
	@Id
	private int SID;
	private String name;
	
	@OneToOne
	@JoinColumn(name = "laptop_id") // This specifies the foreign key column
	private Laptop laptop;

	// Default constructor
	public Student() { }

	// Parameterized constructor
	public Student(int SID, String name, Laptop laptop) {
		this.SID = SID;
		this.name = name;
		this.laptop = laptop;
	}

	// Getters and setters
	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [SID=" + SID + ", Name=" + name + ", laptop=" + laptop + "]";
	}
}
