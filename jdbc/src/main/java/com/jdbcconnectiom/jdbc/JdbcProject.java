package com.jdbcconnectiom.jdbc;
import com.jdbcconnectiom.jdbc.jdbc.JdbcEmployee;


import java.util.Date;
import java.util.List;

public class JdbcProject {
    private String name;

    private int id;

    private Date startDate;

    private Date endDate;

    private List<JdbcEmployee> EmployeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<JdbcEmployee> getEmployeList() {
        return EmployeList;
    }

    public void setEmployeList(List<JdbcEmployee> employeList) {
        EmployeList = employeList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setEmpId(int empId) {

    }

    public void setProjectId(int projectId) {

    }

    public void setAllocationPercentage(double allocationPercentage) {
    }

    public String getEmpId() {
            return null;
    }



}
