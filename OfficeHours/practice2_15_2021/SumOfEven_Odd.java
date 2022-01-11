package practice2_15_2021;

public class SumOfEven_Odd {
    public static void main(String[] args) {

/*
                       (SumOfEven_Odd)
      Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
      even 2,4,6,8,10 ===>30
      odd1,3,5,7,9 ====> 25
                   */
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0; // start number


        do {

            if (i % 2 == 0) {

                sumOfEven += i;// sumOfeven =2+4=6
            } else {
                sumOfOdd += i;// sumOfodd =1+3=4
            }
            i++;


        }while (i <= 10);

        System.out.println("Sum of even numbers are  "+sumOfEven);
        System.out.println("Sum of odd numbers are  "+sumOfOdd);










    }

    }



