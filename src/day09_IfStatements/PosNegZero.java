package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
    int n=200;// try n=-5
    if (n>0){
        System.out.println("Positive");
    }
     if (n<0){
         System.out.println("Negative");
     }
     if (n==0) {
         System.out.println("equal");
     }
        System.out.println("---------------------------");
boolean positive = n>0;
boolean negative = n<0;
if (positive){// if (n>0)
    System.out.println("Positive");
}else if (negative){// if n<(0)
    System.out.println("Negative");
}else {
    System.out.println("equal");
}






















    }














}
