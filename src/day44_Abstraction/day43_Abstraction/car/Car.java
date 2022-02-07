package day44_Abstraction.day43_Abstraction.car;

public abstract class Car {// we can not make object from this class

 private final String brand,model;// we can not change them
 private  String color;
 private final int year;// not changeable
 private double price;
// instance variables


 public Car(String brand, String model, String color, int year, double price) {
  this.brand = brand;// No setter method so keep it this.brand
  this.model = model;
 setColor(color);

  if(year < 1886){// we put condition her because we do not have setter method
   throw new RuntimeException("Invalid Year: "+year);
  }
  this.year = year;

  setPrice(price);
 }

 public String getBrand() {
  return brand;
 }

 public String getModel() {
  return model;
 }

 public String getColor() {
  return color;
 }

 public int getYear() {
  return year;
 }

 public double getPrice() {

  return price;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public void setPrice(double price) {
  if(price <= 0){
   throw new RuntimeException("Invalid price: "+price);
  }

  this.price = price;
 }

 public void stop (){// one implementation for all cars
  System.out.println("Press the brake");
 }

 public abstract void start ();// NO final , No static , No privet ,,,, different implementation for each car

 public String toString() {
  return "Car{" +
          "brand='" + brand + '\'' +
          ", model='" + model + '\'' +
          ", color='" + color + '\'' +
          ", year=" + year +
          ", price=" + price +
          '}';
 }
}
