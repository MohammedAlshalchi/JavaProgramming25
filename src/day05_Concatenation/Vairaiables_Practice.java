package day05_Concatenation;

public class Vairaiables_Practice {
    public static void main(String[] args) {
       byte num1 = 100;
       short num2 = 10000;
       double num3= 3.5;
       float num4 = 2.5f;// or we can use 2.5f // double>float// double num4= 2.5;
       long num5 = 9999999999l; // we can use 99-999-99-99l  ( but will not print)
       int num6 = 850000; // long num6 = 850000;// float num6= 85000;
        System.out.println("num6 = " + num6);
        System.out.println("num5 = " + num5);
        System.out.println("num4 = " + num4);
    }

    public static class BirthDay {
        public static void main(String[] args) {
        String name ="John";
        int birthDay =25;
        String birthMonth = "April";
        int BirthYear = 1995;


            System.out.println(name+" was "+" born "+" on "+birthMonth+"/"+birthDay+"/"+BirthYear);
            System.out.println("-----------");
            System.out.println(name+" was "+" born "+" on "+birthMonth+"/"+birthDay+"/"+BirthYear);
            System.out.println("-----------");
            System.out.println(name+" was "+" born "+" on "+birthMonth+"/"+birthDay+"/"+BirthYear+".");
            System.out.println("........");
            // My favorite book is "bookName"
            String bookName ="The Rich Dad and The Poor Dad";
            System.out.println("My favorite book is :"+"\t"+"\""+bookName+"\"");
            System.out.println("--------");
            System.out.println("My favorite book is :"+"\t"+"\""+bookName+"\"");




        }




    }
}
/*
num1 = 100
num2 = 10000
num3 = 3.5
num4 = 2.5f // float
num5 = 9999999999l// long

 */