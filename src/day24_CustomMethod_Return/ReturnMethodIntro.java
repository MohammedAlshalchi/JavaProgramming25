package day24_CustomMethod_Return;

public class ReturnMethodIntro {

/*
    public static void main(String[] args) {
     String str = "Java";

String result = reverse(str); // ====> we can assign it to variable

       System.out.println(result); // we can print

//if (str.equalsIgnoreCase(result)){ // use it to compare
  //  System.out.println(str+" is plindrome");
//}else {
   // System.out.println(str + " is not palindrome");
}


  // }

    public static String reverse (String str) {

        String reverse = "";

        for (int i = str.length() - 1; i <= 0; i--) {
            reverse += str.charAt(i);
        }

return reverse ;
    }
*/

    public static void main(String[] args) {
        String str = "Java";

        String result =  reverse(str); // we can assign it

        System.out.println(result); // we can print

        if(str.equalsIgnoreCase(result)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }


    public static String reverse(String str){ //"Java"

        String reverse = "";

        for(int i=str.length()-1; i>= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }











































}
