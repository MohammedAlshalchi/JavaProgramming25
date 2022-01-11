package day22_MultiDimensionlArray;

import java.util.Arrays;

public class MultiDimesionalArrayIntro {
    public static void main(String[] args) {
     /*
     String [] group1 = {"Jon","Joes","Janmes"}
     String [] group2 = {"Ali","Reem","Rayan"}
     String [] group3 = {"Mariam","Hanaa","Dalya"}
      */
        String [] group1 = {"Jon","Joes","Janmes"};
        String [] group2 = {"Ali","Reem","Rayan"};
        String [] group3 = {"Mariam","Hanaa","Dalya"};


        String [] [] groups = new String[3][]; // index 0,1,2
        groups [0] = group1;
        groups [1] = group2;
        groups [2] = group3;

        // System.out.println(Arrays.toString(groups)); // for one dimensional array

        System.out.println(Arrays.deepToString(groups));


        System.out.println("========================+++++++++++++++++++++++++");



/*
{1,2,3}
{4,5,6,7}
{8,9,10,11,12}
 */

        //           0 1 2     0 1 2 3     0 1 2  3   4   index of elements
int [] [] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };
//        index       0         1              2
        System.out.println(Arrays.deepToString(arr2D));


        System.out.println("========================+++++++++++++++++++++++++");


        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][3]);












    }
}
