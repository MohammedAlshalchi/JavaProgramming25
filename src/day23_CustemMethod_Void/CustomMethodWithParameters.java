package day23_CustemMethod_Void;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
       oddEven(4);
ageOfPerson(1978);
printNumbers(5,12);

    }



    // create a function that can check if a number is odd number of even number

    public static void oddEven( int number){
        if (number %2 == 0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }


// create a function that can display the age of the person

    public static void ageOfPerson(int birthYear) {
      int age = 2021 -birthYear;
        System.out.println("Age of the person is: is "+age);



    }

// create a function that can print all the numbers between x and y

public static void printNumbers (int x, int y){
    for (int i = x; i < y ; i++) {
        System.out.println(i);
    }


}







































}
