package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
     String[]   students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daiel"};
     String []  earlyBirds = Arrays.copyOf(students,30);
        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("---------------------------------------------------");


        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("---------------------------------------------------");

        char[] ch1 = {'A','B','C','D','E','F','G','H','H'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));


        System.out.println("---------------------------------------------------");

        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        //   index        0   1  2  3  4  5  6  7  8   9

        int [] rersult  =Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(rersult));
        int [] rersult1  =Arrays.copyOfRange(scores,3,scores.length);

        System.out.println(Arrays.toString(rersult1));

























    }
}
