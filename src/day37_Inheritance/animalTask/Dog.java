package day37_Inheritance.animalTask;

public class Dog extends Animal{


     // Dog is the constructor for this class
    // constructor can be called only by anther constructor




// public int a ; ==> we have to added manually
    public Dog(String name, String breed, char gender, int age, String size, String color){
        //public Dog(String name, String breed, char gender, int age, String size, String color,int a)

        super(name, breed, gender, age, size, color); // to call the constructor from anther class(parent class)
       // this.a=a;
    }

    public void bark(){

        System.out.println(name+" is barking");
    }










}
