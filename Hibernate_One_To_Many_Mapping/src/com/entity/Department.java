package com.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

    @Id
    private int DID;
    private String DNAME;

    @OneToMany(mappedBy = "department") // Added mappedBy to link with the 'department' field in Employee
    private List<Employee> emp;

    public Department() {}

    public Department(int dID, String dNAME) {
        this.DID = dID;
        this.DNAME = dNAME;
    }

    public int getDID() {
        return DID;
    }

    public void setDID(int dID) {
        this.DID = dID;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String dNAME) {
        this.DNAME = dNAME;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department [DID=" + DID + ", DNAME=" + DNAME + "]";
    }
}
