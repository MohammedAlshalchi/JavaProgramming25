package practice_01_05_2022;

public class Deeper {
    public static void main(String[] args) { // ==> main method
        System.out.println("Not Deep"); //1
        deep();// ==> call deep method and go to line 11
        System.out.println("Not Deep");//5

    }

    public static void deep() {
        System.out.println(" Deep");//2
        deeper(); // call deeper will go to line 18
        System.out.println(" Deep"); //4

    }

    public static void deeper() {
        System.out.println(" Deeper");//3

    }
}
