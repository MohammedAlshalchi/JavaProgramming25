package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
    String str = "Java";
char [] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

    for (char each :str.toCharArray()){
        System.out.println(each);
    }

        System.out.println("----------------------------------------------");


String sen = "Wooden Spoon";
String [] word = sen.split(" ");
        System.out.println(Arrays.toString(word));


        System.out.println("----------------------------------------------");

        String email = "WoodenSpoon@cydeo.com";
        String [] arr =email.split("@");
        System.out.println(Arrays.toString(arr));































    }
}
