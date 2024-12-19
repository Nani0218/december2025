//package OneToManyJPA;
//
//
//import jakarta.persistence.*;
//import jpaentity.ProjectEntity;
//
//@Entity
//@Table(name = "employee_latest_jpa" ,schema = "sonar")
//public class EmployeeEntity2 {
//
//    public EmployeeEntity2(){
//
//    }
//
//    @Id
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "dept")
//    private String dept;
//
//    @Column(name = "salary")
//    private double salary;
//
//    @JoinColumn(name = "pid",referencedColumnName = "id")
//    @ManyToOne
//    private ProjectEntity projectEntity;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public ProjectEntity getProjectEntity() {
//        return projectEntity;
//    }
//
//    public void setProjectEntity(ProjectEntity projectEntity) {
//        this.projectEntity = projectEntity;
//    }
//
//
//    @Override
//    public String toString() {
//        return "EmployeeEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dept='" + dept + '\'' +
//                ", salary=" + salary +
//                ", projectEntity=" + projectEntity +
//
//                '}';
//    }
//
//
//}
