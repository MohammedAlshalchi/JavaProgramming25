package day42_Exceptions;

public class ThrowsKeywors2 {
    public static void main(String[] args) throws InterruptedException{// we still have error in run time
        // we should use try & catch block
        System.out.println("Test started");

        System.out.println(8/0);
        System.out.println("Test completed");
    }
}
