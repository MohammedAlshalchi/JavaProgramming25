package day22_MultiDimensionlArray;

import java.util.Arrays;

public class ReversedSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" "); //[I, Love, Java]

       String reverse ="";

        for(int i = words[1].length()-1; i >= 0; i-- ){
           reverse += words[1].charAt(i);
       }

        System.out.println(reverse);

         sentence = sentence.replaceFirst(words[1], reverse);

        words[1] = reverse;
       System.out.println(Arrays.toString(words));

        String RESULT ="";

        for (String word : words) {
           RESULT += word + " ";
        }
       System.out.println(RESULT);












    }
}
