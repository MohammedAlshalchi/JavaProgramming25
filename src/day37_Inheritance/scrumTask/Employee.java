package day37_Inheritance.scrumTask;

public class Employee extends Person{

   public String jobTite;
   public int id;
   public double salary;
   public String companyName;

    public Employee(String name, int age, char gender, String jobTite, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTite = jobTite;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

  public void  work () {
      System.out.println(jobTite+" "+name+" is working");
  }

    public String toString() {// to print the employee NOT person
        return "Employee{" +
                "jobTite='" + jobTite + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


























}
