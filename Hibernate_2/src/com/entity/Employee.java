package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  EId;
	private String ENAME;
	private int EAGE;
	
	public Employee()
	{
		
		
	}

	public Employee(int eId, String eNAME, int eAGE) {
		super();
		EId = eId;
		ENAME = eNAME;
		EAGE = eAGE;
	}

	@Override
	public String toString() {
		return "Employee [EId=" + EId + ", ENAME=" + ENAME + ", EAGE=" + EAGE + "]";
	}

	public int getEId() {
		return EId;
	}

	public void setEId(int eId) {
		EId = eId;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public int getEAGE() {
		return EAGE;
	}

	public void setEAGE(int eAGE) {
		EAGE = eAGE;
	}
	

}
