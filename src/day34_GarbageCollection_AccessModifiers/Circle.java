package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double raduis ;
    public static double pi;
   // public static String name = "Circle";
   public static String name;
    public static ArrayList<Integer> numbers;


    //public static Sheet sheet ;
     public Circle ( double raduis){// DO not use instant (constructor) for static because EXTRA memory
         this.raduis = raduis; // will NOT give error but it is NOT recommended
         //pi = 3.14;
     }

    static{
        // radius = 5;
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/




}
