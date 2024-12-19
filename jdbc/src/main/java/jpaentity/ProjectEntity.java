package jpaentity;


import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;




@Entity
@Table(name = "project",schema = "root")
    public class ProjectEntity {

    public ProjectEntity(){

    }

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "pname")
    private String name;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "enddate")
    private Date endDate;

    @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<EmployeeEntity> employeeEntityList;

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

    public List<EmployeeEntity> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntity> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + (employeeEntityList != null ? employeeEntityList.size() + " employees" : "no employees") +
                '}';
    }

}