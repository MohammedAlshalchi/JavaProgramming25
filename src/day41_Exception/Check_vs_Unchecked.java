package day41_Exception;

import day36_Inheritance.encapulation.Student;

public class Check_vs_Unchecked {
    public static void main(String[] args) {

   // unchecked exception ==> during the compiler

  int a = 10;
  int b= 0;
//        System.out.println(a/b);====> NOT ALLOWED
//        System.out.println("Wooden Spoon");
char [] characters = {'A','B','C'};

       // System.out.println(characters[99]);


//        Student student =null;
//       System.out.println(student.getName());
//
//student.study();

//String str = "Wood Spoon";
//str = null;
//        System.out.println(str.toUpperCase());// we can not use because we do not have instant variable

String str2 = "";// not null ... there is object
        System.out.println(str2.isEmpty());

        String str3 = "  ";// not null ... there is object
        System.out.println(str2.isBlank());

//checked Exception:

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked




    }
}
