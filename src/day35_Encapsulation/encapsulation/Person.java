package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
// WITH Encapsulation we have control on the object

    public int getAge(){// should be the same data type ==> EX: int
        return age;
    }

    public void setAge(int age){
        if (age <= 0 || age > 150){
            System.err.println("Invalid Age: ");
            System.exit(0);
        }

        this.age = age;
    }


}
