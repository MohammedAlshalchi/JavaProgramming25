package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
/*
 Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */

        String firstName="cyDEO",
                lastName ="SCHOOL";
firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();// because charAt use it as character
        // NOT as string====> very important

       // firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();


        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastName);

        String fullName= firstName+lastName;

        System.out.println("FullName "+fullName);





























    }



































}
