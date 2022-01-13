package day38_Inheritance.carTask;

public class Toyota extends Car{

// we cat not call by class name we should use super key word
    // to call constructor (car)  we should have constructor (toyota)
    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

   public void reliable () {
       System.out.println(brand+" "+model+" is reliable");
   }





}
