package Day01_12_04_2021;

public class TwoCopies {
    public static void main(String[] args) {
    /*
    create a method to print the last two character three times
     */

       String str = "cydeo";

/*
int str1 =str.length()-1;
 int str2 =str.length()-2;
String str3 = ""+str.charAt(str1)+str.charAt(str2);

        str3 =str3.repeat(3);

        System.out.println(str3);
*/
//int lastTwo = str.length()-2;
//String str1 = str.substring(lastTwo);

        //System.out.println(str1);

String str1 = str.substring(str.length()-2);
        System.out.println(str1.repeat(3));


    }
}
