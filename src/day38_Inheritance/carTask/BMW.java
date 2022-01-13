package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW( String modle, int year, double price, String color, int miles) {
        super("BMW", modle, year, price, color, miles);
    }

public void breaksDown() {
    System.out.println(brand+" "+model+" is brake down ");
}
public void  racing() {
    System.out.println(brand+" "+model+" is racing car");
}

    @Override
    public void start() {
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }

/*
2. BMW:
                extra methods:
                    breaksDown()
                    racing()
 */

}
