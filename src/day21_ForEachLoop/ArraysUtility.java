package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
    int [] nums = {1,2,2,4,5} ;
        System.out.println(nums); // Can not print give us HASHCODE
        System.out.println(Arrays.toString(nums)); // like this : "{1,2,3,4,5}"

        String str = "Java";
        System.out.println(str);
        System.out.println(nums[0]); // ====> element from array


        System.out.println("----------------------------------");


        int[] scores = {95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores)); // Sort then print

        System.out.println("Min Score: "+scores[0]);
        System.out.println("Max Score: "+scores[scores.length-1]);

        System.out.println("-----------------------------------------------");



        String[] names = {"Gunay","Anna","Zuhal","Ahmet","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};

       boolean r = Arrays.equals(arr1,arr2);
        System.out.println(r);
Arrays.sort(arr1);
Arrays.sort(arr2);

boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);
        System.out.println("------------------------------------------");

        char []  ch1 = {'a','c','b'};
        char []  ch2 = {'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);










































    }
}
