package practice12_08_2021;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

/* Write a program that can return the factorial number of any given number

                              Ex:
                                  input: 5
                                  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
                          */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        double result = 1;

        if (number > 2){
            for (int i = number; i >= 1 ; i--) {
                result *= i;
            }

        }else {
            result = number;
        }

        System.out.println("Factoria of "+number+ " is= "+result);










































    }
}
