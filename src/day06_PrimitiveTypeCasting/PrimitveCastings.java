package day06_PrimitiveTypeCasting;

public class PrimitveCastings {
    public static void main(String[] args) {
    byte a= 100;
    short b = a;   //short b= a;

        int c = b;// implicit casting // int c = (int)b that what happen in the program
        long d = c;   // ( long )c

        float e =d;
        double f = e;
        System.out.println("---------------------");
        int x = 55;
        short y = (short) x; // explicit casting
        System.out.println(x+" : "+y);
        System.out.println("---------");
        long j = 1000000;
        short k = (short)j; // will print 16960 because 1000000 out of range of short
        System.out.println(j+" : "+k);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l+" :"+m);
        System.out.println("-------------------------------");
        double n = 10.8;
        int s = (int)n; // s=10
        System.out.println(n+" : "+s);
        System.out.println("----------------------------------------");
        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1); // s1=20
        System.out.println("---------");
        float f1 = 30.5F;
        long l1 = (long) f1;








    }













}
