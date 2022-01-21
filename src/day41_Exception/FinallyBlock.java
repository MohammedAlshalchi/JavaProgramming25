package day41_Exception;

public class FinallyBlock {
    public static void main(String[] args) {

     int []  arr = {1,2,3};


   try {
       System.out.println(arr[10]);
       System.out.println("try BLOCK");

   }catch (RuntimeException e){
       System.out.println("Catch Block");
      e.printStackTrace();
     // System.exit(0);==> to end the program without finally
       //Interview Qa how to stop the program before finally block


   }finally {// must be excuted
       System.out.println("Finally Block");
   }






























    }
}
