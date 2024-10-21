package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String cbranch;
	
	public Bank() {
		
		
	}
	public Bank(int cid, String cname, String cbranch) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cbranch = cbranch;
	}
	@Override
	public String toString() {
		return "Bank [cid=" + cid + ", cname=" + cname + ", cbranch=" + cbranch + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCbranch() {
		return cbranch;
	}
	public void setCbranch(String cbranch) {
		this.cbranch = cbranch;
	}

}
