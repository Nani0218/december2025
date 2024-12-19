package insertintojdbc;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int pid;
    private String dept;
    private int mid;

    public Employee(String john, int i) {

    }

    public Employee() {

    }

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Employee(int id, String name, double salary, int pid, String dept, int mid) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.pid = pid;
        this.dept = dept;
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", pid=" + pid +
                ", dept='" + dept + '\'' +
                ", mid=" + mid +
                '}';
    }
}
