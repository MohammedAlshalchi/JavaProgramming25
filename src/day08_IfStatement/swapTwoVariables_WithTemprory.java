package day08_IfStatement;

public class swapTwoVariables_WithTemprory {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = b;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int e =10;
        int f =15;
        int d = e+f;  // d=25
        e = f; // a=15
        f = d - e;       // b=10
        System.out.println("e= " + a);
        System.out.println("f= " + b);
        System.out.println("d= " + d);
        System.out.println("---------------------------");
        int e1 =10;
        int f1 =15;
       int d1=e1+f1;// d1=25
        f1=e1;//f1=10
        e1=d1-f1;//e1=15
        System.out.println("e1= "+e1);
        System.out.println("f1= "+f1);
    }













}
