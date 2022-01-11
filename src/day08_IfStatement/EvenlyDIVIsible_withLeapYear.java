package day08_IfStatement;

public class EvenlyDIVIsible_withLeapYear {
    public static void main(String[] args) {
    int number =65;
    boolean divisiblyBy2 = number % 2 ==0;
    boolean divisiblyBy3 = number % 3 ==0;  // in case want to check /3
    boolean divisiblyBy5 = number % 5 ==0;  // in case want to check /5
        System.out.println(number+ " is divisible by 2: "+ divisiblyBy2);
        System.out.println(number+ " is divisible by 3: "+ divisiblyBy3);
        System.out.println(number+ " is divisible by 5: "+ divisiblyBy5);
        System.out.println("______________");
        System.out.println(number+ " is divisible by 3: "+ divisiblyBy3);
        System.out.println(number+ " is divisible by 2: "+ divisiblyBy2);
        System.out.println(number+ " is divisible by 5: "+ divisiblyBy5);
        System.out.println("-------------");
int year = 2000;
boolean isLeapYear = year % 4==0;// we can if statement
        System.out.println(year + " is leaper year: "+ isLeapYear);




    }















}
