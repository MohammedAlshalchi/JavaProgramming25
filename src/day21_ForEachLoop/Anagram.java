package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    String str1 = "acbd";
    String str2 = "dbca";

    char [] w  =  str1.toCharArray();
    char [] w2 = str2.toCharArray();

         //System.out.println(Arrays.toString(w));
        // System.out.println(Arrays.toString(w2));

        Arrays.sort(w);
        Arrays.sort(w2);
       // System.out.println(Arrays.toString(w));
      //  System.out.println(Arrays.toString(w2));

        boolean angram = Arrays.equals(w,w2);
        System.out.println("anagram = "+angram);


































    }
}
