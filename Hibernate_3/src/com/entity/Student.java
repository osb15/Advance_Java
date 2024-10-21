package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int  SID;
		private String SNAME;
		private String SCITY;
		public int getSID() {
			return SID;
		}
		public void setSID(int sID) {
			SID = sID;
		}
		public String getSNAME() {
			return SNAME;
		}
		public void setSNAME(String sNAME) {
			SNAME = sNAME;
		}
		public String getSCITY() {
			return SCITY;
		}
		public void setSCITY(String sCITY) {
			SCITY = sCITY;
		}
		@Override
		public String toString() {
			return "Student [SID=" + SID + ", SNAME=" + SNAME + ", SCITY=" + SCITY + "]";
		}
		public Student(int sID, String sNAME, String sCITY) {
			super();
			SID = sID;
			SNAME = sNAME;
			SCITY = sCITY;
		}
		
		public Student() {
			
			
			
		}
		
		



}
