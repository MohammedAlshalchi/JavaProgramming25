package utilities;

public class MathUtility {
  /*
    2.1 Create a method that can return the sum of two integers
            2.2 Create a method that can return the sum of two decimal numbers

            2.3 Create a method that can return the subtraction of two integers
            2.4 Create a method that can return the subtraction of two decimals

            2.5 Create a method that can return the multiplication of two integers
            2.6 Create a method that can return the multiplication of two decimals

            2.7 Create a method that passes two double parameters and return the division result

            2.8 Create a method that can check if an integer is even number
            2.9 Create a method that can check if an integer is odd number

            2.10 Create a method that can return the maximum number between two integers
            2.11 Create a method that can return the maximum number between two decimal numbers

            2.12 Create a method that can return the minimum number between two integers
            2.13 Create a method that can return the minimum number between two decimal numbers

            2.14 Create a method that can return the square of an integer
                    Ex: square(2) ==> 4
            2.15 Create a method that can return the square of a double

            2.16 Create a method that can return the cube of an integer
            2.17 Create a method that can return the cube of a double
   */


    //1. returns sum of two integers
    public static int sum(int num1, int num2){
        return num1+num2;
    }

    //2. returns sum of two decimals
    public static double sum(double num1, double num2){
        return num1+num2;
    }

    //3. returns subtraction of two integers
    public static int subtraction (int num1, int num2){
        return num1-num2;
    }

    //4. returns subtraction of two decimals
    public static double subtraction (double num1, double num2){
        return num1-num2;
    }

    //5. returns multiplication of two integers
    public static int multiplication (int num1, int num2){
        return num1*num2;
    }

    //6. returns multiplication of two decimals
    public static double multiplication (double num1, double num2){
        return num1*num2;
    }

    //7. returns division of two integers
    public static int division (int num1, int num2){
        return num1/num2;
    }

    //8. returns division of two decimals
    public static double division (double num1, double num2){
        return num1/num2;
    }

    //9. Checks if an integer is even number, returns boolean
    public static boolean even (int num){
        return num%2 == 0;
    }

    //10. Checks if an integer is odd number, returns boolean
    public static boolean odd(int num){
        return num%2 != 0;
    }

    //11. returns max number between two integers
    public static int max (int num1, int num2){
        return (num1 >= num2) ? num1 : num2;
    }

    //12. returns max number between two decimals
    public static double max (double num1, double num2){
        return (num1>=num2)? num1 : num2;
    }

    //13. returns min number between two integers
    public static int min(int num1, int num2){
        return (num1 <= num2)? num1 : num2;
    }

    //14. returns min number between two decimals
    public static double min(double num1, double num2){
        return (num1 <= num2)? num1 : num2;
    }

    //15. returns square of an integer
    public static int square (int num){
        return num*num;
    }

    //16. returns square of a double
    public static double square (double num){
        return num*num;
    }

    //17. returns cube of an integer
    public static int cube  (int num){
        return num*num*num;
    }

    //18. returns cube of a decimal
    public static double cube (double num){
        return num*num*num;
    }
























































}
