package day38_Inheritance.carTask;

public class Car {
/*
 Create a class called Car
        instance variables:
            brand, model, year, price, color, miles
            add a constructor to set all the fields
        instance methods:
            start(), drive(),toString()
 */

public String brand,model; // instance so we can not make static
public int year;// we can use privet
public double price;
public String color;
public int miles;

    public Car(String brand, String modle, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = modle;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }
// must be inheritance to make overriding
    // we have one method in overriding with METHOD overloading we will have new method

    public void start () {// we have to make NOT static because we will use it for differnet cars
        System.out.println(brand+" "+model+" is starting");
    }
    public void drive(){
        System.out.println(brand +" "+ model + " is driving");
    }


//  public void drive() {
//   we can not use because it is not common for all cars
//  }is not common for all the cars, and parent class should only contain the common feature of all the subclasses


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modle='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }





}
