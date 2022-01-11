package Day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch ='A';// we cannot use 'A' || 'B' OR && because that's will be boolean
String result ="";
        switch (ch){// try 'F'
            case 'A':// just need Passed OR Failed
            case 'B':
            case 'c':
            case 'D':
                result=("Passed");
                break;
            case 'F':
                result=("Failed");

            default:result="In Valid";

        }

        System.out.println(result);





































    }


























}
