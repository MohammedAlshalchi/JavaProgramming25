package Day01_12_04_2021;

public class CastingPractices {
    public static void main(String[] args) {

        // byte to short
     byte b =10;
     short s =b; // implicit casting

        // double to int
        double d =5.3;
        int i = (int) d; // explicit casting

        // long to int
        long l = 9999999999l; //  long l = 999999999; ==> we can (9 digits)
        int k = (int)l;

        System.out.println("k ="+k);

        System.out.println("---------------------------------------------------");

float a = 12.12f; // float a =(float) 12.12; OR double = 12.12;
        // float for integer NOT for decimal
short j = (byte)a;
byte c = (byte)b;

        System.out.println("_________________________________-------");

        String str = "Hello";
        // System.out.println(""+str.charAt(0)+str.toUpperCase().charAt(1));  ====>NO.1

         str = str.toUpperCase();
         //String w = ""+str.charAt(0)+str.charAt(1); =========> N0.2

         String w =str.substring(0,2); // ======> NO.3

         System.out.println(w);



















    }
}
