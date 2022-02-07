package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{
    // we can make it final BUT we can not inheritance  the class
    // we can use abstract AND no need to use implementation for methods
/*
 Dog
                eat(): eats Pizza
 */
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark (){// we can make it final
    System.out.println(getName()+" is barking");
}



    @Override
    public void eat() {
        System.out.println(getName()+" eats pizza");
    }


    @Override
    public void play() {
        System.out.println("getName()+\" is playing with ball\" = " + getName() + " is playing with ball");
    }
}
