package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

    Employee employee1 = new Employee("Tahir",'M',30,120000);

        System.out.println(employee1);

Employee employee2 = new Employee("Aygon",'F',31,115000);
employee2.setSalary(employee2.getSalary()+15000);
employee2.setName("Elvira");
        System.out.println(employee2);




    }











































}
