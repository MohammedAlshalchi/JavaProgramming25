package day30_CustomClass;

public class Car {
    /*
    Car Class:
Attributes:
        brand, model, color, year, price
 Actions:
        drive(), start(), stop(), toString(), setInfo()
*/
    public String brand;
    public String model;
    public String color;
    public int    year;
    public double price;


    public void setInfo ( String carBrand , String Carmodel , String Carcolor , int Caryear ,
                          double Carprice ){

      brand  = carBrand;
      model  = Carmodel;
      color  = Carcolor;
      year   = Caryear;
      price  = Carprice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive (){
        System.out.println("Driving "+brand +" "+model);
    }

    public void start (){
        System.out.println(brand + " "+model+" has started");
    }

    public void stop (){
        System.out.println(brand+" "+model+" has stopped");
    }
}
