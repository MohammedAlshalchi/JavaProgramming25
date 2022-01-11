package day17_DoWhile;
/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */
public class FrequencyOfWord {
    public static void main(String[] args) {
/*
        String str ="JavaJava";
        int frequency =0;

        for (int i = 0; i <str.length()-3 ; i++) {// i =<str.length()-4
          String eachSub = str.substring(i,i+4);
          if (eachSub.equals("Java")){
              frequency++;
          }


        }

        System.out.println(frequency);


*/

        String str = "JavaJavaJava";
        String str1 = "Java";
        int fre=0;


        for (int i = 0; i <str.length()-3 ; i++) {
            String str2 =str.substring(i,i+4);
            if (str1.equals(str2)){
                fre++;
            }

        }


        System.out.println(fre);






































    }
}
