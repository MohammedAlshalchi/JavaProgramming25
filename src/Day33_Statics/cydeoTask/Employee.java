package Day33_Statics.cydeoTask;

public class Employee extends Person{
    /*
     2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:
                work()
                toString()
     */

    public Employee(String name, int age, char gender, int employeeId, String jobTiltle, double salary) {
        super(name, age, gender);
//        this.employeeId = employeeId;
//        this.jobTiltle = jobTiltle;
//        this.salary = salary;
        setEmployeeId(employeeId);
        setJobTiltle(jobTiltle);
        setSalary(salary);
    }

    private int employeeId;
    private String jobTiltle;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTiltle() {
        return jobTiltle;
    }

    public void setJobTiltle(String jobTiltle) {
        this.jobTiltle = jobTiltle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 public void work () {
     System.out.println(getName()+" is working");
 }

    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", jobTiltle='" + jobTiltle + '\'' +
                ", salary=" + salary +
                '}';
    }
}













