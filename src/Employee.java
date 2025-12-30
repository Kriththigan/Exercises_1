public class Employee {
    private String empId;
    private double salary;
    public Employee(String empId, double salary){
        this.empId = empId;
        this.salary = salary;
    }
    public String getEmpId(){
        return empId;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
