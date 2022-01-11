package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
      String firstName = "Mohammed";
      String lastName ="Alshalchi";
      String fullName = firstName + " " +lastName;// very important Example
      int age = 45;
      String jobTitle = "SDET";
      String companyName = " Apple";
      double salary = 100000.58;
        System.out.println("lastName = " + lastName);
        System.out.println("-------");

        System.out.println("fullName");
        System.out.println("-------");
        System.out.println("fullName of the person " + fullName);
        System.out.println("--------");
      System.out.println("age = " + age);
      System.out.println("------------");
      System.out.println(fullName+ " is "+ age + " years old ");//system.out.println(fullName+"is"+45+"years old"
      // but we have to print the nam  each time
      System.out.println("firstName = " + firstName);
      System.out.println("---------");
      System.out.println(fullName + "is" + jobTitle +"working with" + companyName);
      System.out.println("--------");
      System.out.println(fullName + " is " + jobTitle + " works at " + companyName + " and " + fullName + "'s Salary " + salary);
      System.out.println("-------");
      System.out.println(fullName + 45 + jobTitle + " works at " + companyName + " and " + fullName + "'s Salary " + salary);
// we can put 45 but we can not put is
// System.out.println(fullName + is + jobTitle + " works at " + companyName + " and " + fullName + "'s Salary " + salary);// this wrong




    }






}
