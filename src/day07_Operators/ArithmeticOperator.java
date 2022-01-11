package day07_Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
     int num1 = 10;// when change to 9 we will get 0 remainder
     int num2 = 3;
     // 10 divide by 3 is equal to 3 with a remainder of 1
        int division = num1/num2;
        int remainder =num1%num2;
        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);
        System.out.println("------------------------------");
        System.out.println(num1+" divided by "+num2+" is equal to "+division+" with remainder "+" with a remainder "+remainder);
        System.out.println("------------------------------");
        System.out.println(num1+" divided by "+num2+" is equal to "+division+" with remainder "+" with a remainder "+remainder);// chang to 9
// we change num1 to 9
        System.out.println("------------------------------");
//what is remainder for 25%4
        System.out.println(25%4);
        System.out.println("------------------------------");
    }




}
