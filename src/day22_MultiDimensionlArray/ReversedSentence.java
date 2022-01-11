package day22_MultiDimensionlArray;
import java.util.Arrays;

public class ReversedSentence {
    public static void main(String[] args) {

/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";
			output:
				Java learn to day good a is Today
 */
        String sentence = "Today is a good day to learn Java";

        String[] words = sentence.split(" "); // to change the String to array

        System.out.println(Arrays.toString(words));

        String reversedSentence = ""; //Java learn to day good a is Today

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] +" ";  // words[i] is an element NOT array
        }

        System.out.println(reversedSentence);

























    }
}
