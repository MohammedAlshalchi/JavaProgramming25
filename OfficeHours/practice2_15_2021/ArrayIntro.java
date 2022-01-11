package practice2_15_2021;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {


     String [] color = {"Yellow" , "Blue", "Purple"}; // type 1



     String [] color2 = new  String[3]; // type 2
        color2 [0] = "Red";
        color2 [1] = "Orange";
        color2 [2] = "Green";

        System.out.println(Arrays.toString(color2)); // print the array
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(color[1]); // print element
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(color.length); // ===> find the size of array
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



        int [] num = new  int[4];
        num [0] =42;
        num [1] =35;
        num [2] =12;
        num [3] =9;
        System.out.println(Arrays.toString(num));
int [] num1 = {1,2,3,4};
        System.out.println("Arrays.equals(num,num2) = "+Arrays.equals(num,num1)); //work like boolean
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
























































    }








































































}
