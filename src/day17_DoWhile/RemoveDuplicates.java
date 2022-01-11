package day17_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
/*
    String str = "AABCC";
    String result = "";

        for (int i = 0; i <str.length() ; i++) {
            String  ch =""+str.charAt(i);      // ==> we use [String] to convert numbers to  string
            if (result.contains(ch)){         // =======>contains just for STRING
                continue;                    // result.contains(""+ch)
            }
            result += ch;
        }

        System.out.println(result);
*/

        String str = "AAABBBBCDD";
        String str1 ="";


        for (int i = 0; i <str.length() ; i++) {
            String str2 = ""+str.charAt(i);
            if (str1.contains(str2)){
                continue;
            }
            str1+=str2;

        }


        System.out.println(str1);





















    }
}
