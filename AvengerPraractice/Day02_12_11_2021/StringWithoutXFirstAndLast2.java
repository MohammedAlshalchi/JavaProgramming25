package Day02_12_11_2021;

public class StringWithoutXFirstAndLast2 {

    public static void main(String[] args) {



            String word="Hxix";
            String temp="";

            //0123
            // input:  "xHix" → Hi
            if (word.charAt(0) == 'x' && word.charAt(word.length()-1) == 'x' ){
                for (int i = 1; i <word.length() -1; i++) {
                temp += word.charAt(i);
            }
            }else if (word.charAt(0) == 'x'){

                //012
                //   input :"xHi" → Hi
                for (int i = 1; i <word.length() ; i++) {
                    temp+=word.charAt(i);
                }
            }
            //0123
            //   input :"Hxix" → Hxi
            else if (word.charAt(word.length()-1) == 'x'){ // means last character
                //2   //3
                for (int i = 0; i <word.length() -1; i++) {
                    temp+=word.charAt(i);
                }
            }

            System.out.println("temp = " + temp);
        }


































































    }














































































