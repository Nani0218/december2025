package com.jdbcconnectiom.jdbc.jdbc;

import com.jdbcconnectiom.jdbc.JdbcProject;

import java.util.List;

public class JdbcEmployee {


    public List<JdbcProject> getEmpAllocation   ;
    private int id;

    private String name;

    private String dept;

    private double salary;

    private int pid;

    private  int mid;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }


}
