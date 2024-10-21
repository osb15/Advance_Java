package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int Model;
	
	
	public Bike () {
		
		
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


	public int getModel() {
		return Model;
	}


	public void setModel(int model) {
		Model = model;
	}


	public Bike(int id, String name, int model) {
		super();
		this.id = id;
		this.name = name;
		Model = model;
	}


	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", Model=" + Model + "]";
	}
	

}
