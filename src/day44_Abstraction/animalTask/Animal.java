package day44_Abstraction.animalTask;

public abstract class Animal {
    /*
    Animal Task:
    Create an abstract class named Animal:
        Variables:
            name, breed(final), gender(final),  age, size, color(final)
        Encapsulate all the fields
        Add a cosntructor that can set all the fields
        Methods:
            eat() ==> different animals eat different foods
            drink() ==> all the animals drink water
            toString() ==> to display the full info of the animal
     */

    private String name;
    private final String breed;// bread will not so make final
    private final char gender;
    private int age;// age will change NO final
    private String size;
    private final String color;
    // static will be for the variable but we can change it
    // final will be for all variable but WE CAN NOT CHANGE IT


//    public final static boolean canBreath = true;

public final static boolean canBreathe;

static {
    canBreathe= true;
    if (canBreathe == false){
        throw new RuntimeException("Invalid");
    }
}

    public Animal(String name, String breed, char gender, int age, String size, String color) {
       // this.name = name;
        setName(name);

        this.breed = breed;// because we do not have setter we should put condition here
        if (! (gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }

        this.gender = gender;
        //this.age = age;
        setAge(age);
       // this.size = size;
        setSize(size);
        this.color = color;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
    if (name.isEmpty()){
        throw new RuntimeException("Invalid name: "+name);
    }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }


public final void drink (){
    System.out.println(name+" is drinking");
}

public abstract void eat ();// we can not use final because we need to override the method 



}
