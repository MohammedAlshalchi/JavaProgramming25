package day14_String.practice_01_12_2022.accessModifier;

import practice_01_05_2022.WrapperClassIntro;

public class AccessModifier {
    public static void main(String[] args) {

      Person person = new Person(); // create object
      person.ID = 123; // because public
       person.name = "Palina";
       person.lastName ="Ivankiu";
      // person.age = 25; ==> not public it is privet

        WrapperClassIntro wp = new WrapperClassIntro();// if we remove public and put privet  in WraperClass we can not reach it
        System.out.println("wp.str = "+wp.str);




































    }
}
