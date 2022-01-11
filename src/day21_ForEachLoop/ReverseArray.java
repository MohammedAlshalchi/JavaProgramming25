package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

    int[]  numbers = {10,20,30,40,50};
    //                 0 1  2  3   4
     int[]  reversed = new int[numbers.length] ;// to make sure the new array has the same length

        //System.out.println(Arrays.toString(revesed));

        for (int i = numbers.length - 1, j=0 ; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }




        System.out.println(Arrays.toString(reversed));








































    }
}
