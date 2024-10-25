package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    private int Eid;
    private String Ename;

    @ManyToOne
    @JoinColumn(name="department_id") // Corrected column name to match conventional naming
    private Department department;

    public Employee() {}

    public Employee(int eid, String ename) {
        this.Eid = eid;
        this.Ename = ename;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        this.Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        this.Ename = ename;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Department=" + department.getDNAME() + "]";
    }
}
