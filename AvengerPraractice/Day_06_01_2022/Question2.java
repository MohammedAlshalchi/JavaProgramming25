package Day_06_01_2022;

public class Question2 {
    boolean canBounce;
    String color;// instance variable
// default of int is ZERO
    // default for String is null
   // default of boolean is false
    public static void main(String[] args) {

        Question2 obj = new Question2();
        String color;// local variable , we ca not use it outside this method
        color = "red";
        System.out.println(obj.color);
        System.out.println(color);
    }
}
