package Day33_Statics.day37_Inheritance.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color); // because constructor can Not be inherited
    }







    public void scratch(){
        System.out.println(name+" is scratching");
    }













}