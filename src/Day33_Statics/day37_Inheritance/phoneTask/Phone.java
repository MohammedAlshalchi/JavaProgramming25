package Day33_Statics.day37_Inheritance.phoneTask;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

public static boolean hasBattery = true;

          // we use consutractor
    public Phone(String brand, String model, String size, String color, double price) {// NO setInfo method
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


   public void call ( long phoneNumber) {
       System.out.println(brand+" "+model+" is calling "+phoneNumber);
   }

    public void text ( long phoneNumber) {
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", has a battery" + hasBattery +
                '}';
    }
}
