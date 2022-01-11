package day37_Inheritance.animalTask;

public class Parrot extends Animal{

    // public String parrotWingColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
       // System.out.println();  ==> can NOT call it in the second step
        super(name, breed, gender, age, size, color); //,String parrotWingColor
        // Animal(name, breed, gender, age, size, color); ==> can not call with parent class name
        // this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        //super(name, breed, gender, age, size, color); ==> can NOT call in another method
        System.out.println(name+" is singing");
    }
















}
