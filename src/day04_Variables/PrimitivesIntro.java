package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age:38 years old
        byte age = 38;
        // weight : 160 pound , 160 is out of range of byte
        short weight = 160;
        // salary : 100000 $  ... 100000 is out of range of short
       int salary = 100000; // int is the preferred data type for integer numbers

       long asset = 3_333_333_333L;

       //tax: 0.26F
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 ='#' ;
        System.out.println("ch3 = " + ch3);
        String name = " mohammed" ;
        System.out.println("name = " + name);
        System.out.println("--------");
        char ch4 =36;
        System.out.println("ch4 = " + ch4);
        System.out.println("------------------------------");
        char chr5 = 100;
        System.out.println("chr5 = " + chr5);
        System.out.println("----------------------------");
        char yesNo ='Y';
        System.out.println("yesNo = " + yesNo);
        System.out.println("----------------------------");
        boolean isEmployeed =true;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("----------------------------");
        boolean no = 100>50;
        System.out.println("no = " + no);



    }


}
