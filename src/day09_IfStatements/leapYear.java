package day09_IfStatements;

public class leapYear {
    public static void main(String[] args) {
    int year = 2000;// try 2001
    boolean leapYear = year%4 == 0;
    if (leapYear){
        System.out.println("Year "+year+" is a leap year");
    }
     if (!leapYear) {
         System.out.println("Year " + year + " is not a leap year ");
     }
        System.out.println("-------------------------------------------");
     if (leapYear){
         System.out.println("Year "+year+" is leap year");
     }else {
         System.out.println("Year "+year+" is not a leap year");
     }



















    }















}
