package day23_CustemMethod_Void;

public class MainMethodPractice2 {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5times();
        evenNumbers();
    }


    // Creat a function that can print hello world 5 times ====> helloWorld5Times()
    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }


    // Create a function that can print hello Cydeo 5 times ====> helloCydeo5times
    public static void helloCydeo5times(){

        for (int i = 0; i <5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

// create a fumctio that can print all the even numbers from 1 to 10 ====> evenNumbers
    public static void evenNumbers (){

        for (int i = 2; i < 11 ; i += 2) {
            System.out.println(i);
        }
    }










































}
