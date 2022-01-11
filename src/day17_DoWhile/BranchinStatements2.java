package day17_DoWhile;

import java.util.Scanner;

public class BranchinStatements2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
int count =0;
        for (int i = 1; i <= 10; i++) {

            if (i%2 !=0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (int i = 1; i <= 10; i++) {

            if (i %2 ==0){
                continue;
            }

            System.out.println(i);
        }






























    }
}
