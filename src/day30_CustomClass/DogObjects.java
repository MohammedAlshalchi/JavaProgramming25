package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name   = "Lucy";
        dog1.breed  = "Husky";
        dog1.age    = 5;
        dog1.gender = 'F';
        dog1.size   = "Small";
        dog1.color  = "White";
        System.out.println(dog1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Dog dog2 = new Dog();
        dog2.name   = "ACE" ;
        dog2.breed  = "Husky";
        dog2.age    = 5;
        dog2.gender = 'M';
        dog2.size   = "Large";
        dog2.color  = "White & Black";
        System.out.println(dog2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large",
                "Black");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        dog1.eat();
        dog2.bark();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



Dog dog4 = new Dog();
        dog4.setInfo("lolo", "COCO", 4, 'F', "Xtra Large",
                "Brown");


        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large",
                "Yellow");

Dog [] dogs = {dog1,dog2,dog3,dog4,dog5};


      //  ArrayList<Car> carsList = new ArrayList<>();
       // carsList.addAll(Arrays.asList(car1,car2,car3))

ArrayList <Dog> Dogs = new ArrayList<>(); // converting to arrayList
//Dogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        Dogs.addAll(Arrays.asList(dogs));
        System.out.println("Dogs is : "+Dogs);











    }
}
