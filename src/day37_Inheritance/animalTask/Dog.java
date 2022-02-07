package day37_Inheritance.animalTask;

public class Dog extends Animal{

//public String lastName;
// public int a ; ==> we have to added manually


     // Dog is the constructor for this class
    // constructor can be called only by anther constructor

   // public Dog(String name, String breed, char gender, int age, String size, String color,String lastName){
public Dog(String name, String breed, char gender, int age, String size, String color){
        //public Dog(String name, String breed, char gender, int age, String size, String color,int a)

        super(name, breed, gender, age, size, color); // to call the constructor from anther class(parent class)
       // this.a=a;
       // this.lastName=lastName;
    }

    public void bark(){

        System.out.println(name+" is barking");
    }


//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", breed='" + breed + '\'' +
//                ", gender=" + gender +
//                ", age=" + age +
//                ", size='" + size + '\'' +
//                ", color='" + color + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }






}
