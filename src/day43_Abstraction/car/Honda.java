package day43_Abstraction.car;

public class Honda extends Car{
//// each method should have implementation
//    public Honda (String brand, String model, String color, int year, double price) {
//        super(brand, model, color, year, price);
//    }
//
// // public abstract void method1 (){} ====> WE can not
//
//    public void start (){
//        System.out.println("Twist the key to ignition");
//    }
//
//    @Override
//    public void stop() {
//        super.stop();
//    }
public Honda( String model, String color, int year, double price) {
    super("Honda", model, color, year, price);
}


    public void start(){
        System.out.println("Twist the key to ignition");
    }
}
