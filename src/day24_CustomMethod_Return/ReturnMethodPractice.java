package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
    /*
    create method to find the max number between 100 ~ 200 and then multiply the max by 2
     */
    int MaxNumber = max(100,200);
        System.out.println(MaxNumber);
int sum = MaxNumber * 2;
        System.out.println(sum);

    }

   public static int max (int a , int b){
        int result = 0;
        if (a > b){
            result = a;
        }else {
            result =b ;
        }

        return result;


   }





























































}
