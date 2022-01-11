package utilities;

import java.util.Arrays;

public class StringUtility {

    // print each character in String
    public static void printEachChar ( String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }


    //reverses the given string and returns the reversed string
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }



    // check if the given string is palindrome
public static boolean isPlaindrome (String str){

 return reverse(str).equalsIgnoreCase(str);



}


    // check if the string is anagram, returns boolean
public static boolean anagram ( String str1 , String str2 ){

      char [] ch1 = str1.toCharArray();
      char [] ch2 = str2.toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1 , ch2);
}



    // remove the deplucate from given string, returns boolean
public static String removeDuplicates ( String str ){

     String result = "";
    for (int i = 0; i < str.length() ; i++) {
        char each = str.charAt(i);

        if ( ! result.contains(""+ each)){
            result += each;
        }

    }
    return result;

}




























}
