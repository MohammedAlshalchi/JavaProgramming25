package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable{
    /*
    Parrot
                eat(): eats chocolate
     */

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void play() {
        System.out.println("getName()+\" is plying with me\" = " + getName() + " is plying with me");
    }
}
