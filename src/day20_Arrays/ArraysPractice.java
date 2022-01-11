package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------");


int [] scores = new int[5];
scores[1] =85;
scores[scores.length-1] =75;
scores [3] = 65;
scores [0] =50;
scores[2] =95;

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------------------------------");


        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};  //0 ~ 11 (length -1)

/*
        System.out.println( months[0] ); // Jan
        System.out.println( months[1] );// "Feb
        System.out.println( months[2] );
        System.out.println( months[3] );
        System.out.println( months[4] );
        System.out.println( months[5] );
        System.out.println( months[6] );
        System.out.println( months[7] );
        System.out.println( months[8] );
        System.out.println( months[9] );
        System.out.println( months[10] );
        System.out.println( months[11] );
*/

        for(int i = 0; i < months.length; i++){ //i: represents the index numbers of array starting from 0
            System.out.println( months[i] );
        }

        System.out.println("-----------------------------------------------");

        for(int i = months.length-1; i >= 0; i--  ){//i: represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }


































    }







}
