package Day10_NestedIf;

public class FizzBuzz {
    public static void main(String[] args) {
       int number= 15; // try 17 ===> invalid
       if (number%3==0 && number%5!=0){
           System.out.println("Fizz");
       }else if (number%5==0 && number%3!=0){
           System.out.println("Buzz");
       }else if (number%5==0 && number%3==0){
           System.out.println("FizzBuzz");
       }else System.out.println("InValid");








































    }






















}
