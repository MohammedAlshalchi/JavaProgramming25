package day47_Polymorphism;

import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Person;
import day43_Abstraction.employee.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Shape;
import day45_Abstraction.shapeTask.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Shape shape = new Circle(4) ;// casting done implicitly === upcasting
        // Shape shape =(Shape) new Circle(4) ; ===> done in the back of programme


Shape shape1 = new Square(5);
        System.out.println( ( (Square)shape1).getSide() );
        // WebDriver driver = (WebDriver) new ChromeDriver();



         Dog  dog = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;

        Animal animal = new Dog("Max","Husky",'M',3,"Small","White");
//   Dog dog = (Dog)animal; // downcasting with variable we can use it later


        //animal.bark();
         dog.bark();

        System.out.println(animal.getName());
        // System.out.println( dog.getName() );


        (  (Dog)animal  ).bark();// if we do not to use the variable again





        Shape shape3 = new Square(4);



        System.out.println(((Square) shape3).getSide());



        System.out.println("==========================+++++++++++++++++++++++++++++++");

        Animal animal2 = new Cat("Jim","Scotish",'M',3,"Small","White");
        Cat cat = (Cat) animal2;// if we want to use the variable (cat) again
        cat.eat();

        animal2.eat();

        ((Cat) animal2).meow();// to use one time

       // ((Dog) animal2)  .bark();===>NO IS A relation between Dog and Cat

        System.out.println("==========================+++++++++++++++++++++++++++++++");


        Employee employee = new Tester("Ali",30,'M',42,"SDET",140000);

       ((Tester) employee).bugReport();
        //  ( (Tester)employee ).unitTest();===> tester has no unitTest method

        //  ( (Developer)employee ).unitTest();====>It will work but It will through exception becase there is NO
        // IS-A relation between Developer and Tester

            //Driver driver = (Driver) employee;  // line 1
              Person person = (Person) employee ;//line2
            //Teacher teacher = (Teacher) employee; // line 3====> tester is not teacher NO relation

        System.out.println("==========================+++++++++++++++++++++++++++++++");

       Shape s1= new Circle(10) ;
            s1.area();
            s1.perimeter();
        //  ( (Cube)s1 ).volume();====> we can run it BUT there is  NO IS-A  relation



















    }










}
