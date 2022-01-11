package Day03_12_18_2021;

public class CountWord2 {
    public static void main(String[] args) {
/**
 * Count the word that is given inside the sentence
 *                                 input: Java is Java
 *                                 word:Java
 *                                 output:2
 */

        String sentence="Java is Java";
        String word="Java";
        int count=0;

        while (sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,"");
        }
        System.out.println("count = " + count);











































    }
}
