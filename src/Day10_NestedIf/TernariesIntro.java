package Day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
      int n =100;
      if (n%2 ==0){
          System.out.println("Even");
      }else {
          System.out.println("Odd");
      }

        System.out.println("-------------------------------------------------");
        String result1 = (n%2 == 0)?"Even" :"Odd";
        System.out.println(result1);
        System.out.println("-------------------------------------------------");

        int age =17;
        if (age>=21){
            System.out.println("Eligible");// String
        }else {
            System.out.println("Not Eligible");// String
        }

        System.out.println("-------------------------------------------------");

String result2 =(age >= 21)? "Eligible" : "Not Eligible";
       // System.out.println=(age>=21) ? "Eligible": "Not Eligible";

        System.out.println("-------------------------------------------------");
int number =100;
     String result3  = (number >0)? "Positive" :(number<0) ?"Negative" : "Zero";

        System.out.println(result3);
/*
if (number>9){
syst
 */



















    }























}
