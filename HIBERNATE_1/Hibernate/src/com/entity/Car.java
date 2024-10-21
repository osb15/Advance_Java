package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  CID ;
	private String CName;
	private String Cmodel;
	
	public Car() {
		
		
	}

	@Override
	public String toString() {
		return "Car [CID=" + CID + ", CName=" + CName + ", Cmodel=" + Cmodel + "]";
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCmodel() {
		return Cmodel;
	}

	public void setCmodel(String cmodel) {
		Cmodel = cmodel;
	}

	public Car(int cID, String cName, String cmodel) {
		super();
		CID = cID;
		CName = cName;
		Cmodel = cmodel;
	}
	
	

	
	

}
