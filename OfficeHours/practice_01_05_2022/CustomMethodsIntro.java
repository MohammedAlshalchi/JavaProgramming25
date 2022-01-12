package practice_01_05_2022;

public class CustomMethodsIntro {
    /*
        public static void main(String[] args) {

      sum(5,4);

        // sum(5.5,4);  ==> Compiler Error because 5.5 is double

        System.out.println(sum1(5, 4)); ==> to print the return type
        sum1(a:5, b:4); ==> return type will not print anything

   }

   public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static int sum1(int a,int b){

       return a+b;
    }
*/

    public static int sum(int a,int b){

        return a+b;
    }

    public static void main(String[] args) {
        double a=5.4;
        double b=5.3;
        // System.out.println(sum(a,b));     // Compiler Error
    }

    // Compiler can do for us only Implicit Casting

}
