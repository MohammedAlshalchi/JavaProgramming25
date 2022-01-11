package Day12_Scanner;

import java.util.Scanner;//import java.util.*; WIlL BRING ALL IN util

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// if there is No scanner==> new Scanner(System.in).scan.nextInt()
        System.out.println("Entre a NO. = ");
byte num = (byte) scan.nextInt();// int num = (byte) scan.nextInt();
        String result ="";
        if (num>=1 && num<=7 ){
            result=(num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wwdnesday"
                    :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" :"Sunday";




        }else {
            result="In Valid Number";
        }


        System.out.println(result);
        scan.close();


















    }










}
