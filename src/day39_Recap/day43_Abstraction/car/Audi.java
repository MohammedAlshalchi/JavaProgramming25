package day39_Recap.day43_Abstraction.car;

public class Audi extends Car{// we can make final and we can make object as usual


    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }


    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }


























}
