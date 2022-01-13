package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla( String modle, int year, double price, String color, int miles) {
        super("Tesla", modle, year, price, color, miles);
    }
    public void autoPilot (){
        System.out.println(brand+" "+model+" is autopilot mode");
    }


    @Override
    public void start() {
        System.out.println("Say \"start\" to start "+brand+" "+model);
    }
}
