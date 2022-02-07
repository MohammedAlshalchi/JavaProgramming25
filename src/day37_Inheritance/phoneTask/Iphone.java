package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, color,price);
    }              //we are sure from Iphone

    public final void faceTime(long phoneNumber){// gray color means No need to write it because we put final in the main class
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


















































}
