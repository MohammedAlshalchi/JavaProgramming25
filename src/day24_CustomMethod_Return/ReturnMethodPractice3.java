package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {
/*
int secondFrequncy = frequency ("aaaabbbbf" , 'b');
        System.out.println(secondFrequncy);
*/



 String str = "aabccdee";
        for (int i = 0; i < str.length(); i++) {

            int frequency1 = frequency(str, str.charAt(i));

            if(  frequency1 == 1 ){
                System.out.println(str.charAt(i));
            }

        }

    }


    //                              "aa"      'a'
    public static int frequency (String str, char ch){ // this is for one character

        int count = 0;

        for (char each : str.toCharArray()) {
            if(each == ch){
                count++;
            }
        }

        return count;
    }









































}
