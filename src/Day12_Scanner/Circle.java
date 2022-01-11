package Day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

Scanner scan= new Scanner(System.in);

String result=" ";
double r = scan.nextDouble();
double area =r*r*3.14;
double perimeter = 2*r*3.14;

        System.out.println("Area = "+area);
        System.out.println("Perimeter= "+perimeter);

scan.close();






    }








}
