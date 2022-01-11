package day07_Operators;

public class casting<main> {
    public static void main(String[] args) {

float averageScore = 20.5f;//
byte num1 = (byte)averageScore;// explicit casting
// will print 20
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        float num4 =averageScore;// NO casting// will print 20.5
        double num5 = averageScore;// implicit casting// will print 20.5
        long num6 = (long) averageScore;
        System.out.println("num1 = " + num1);
        System.out.println("----------------------------------------");
        System.out.println("num2 = " + num2);
        System.out.println("----------------------------------------");
            System.out.println(num3);
            System.out.println("----------------------------------------");
        System.out.print(num3);
        System.out.println("----------------------------------------");
        System.out.println("num = " + num4);
        System.out.println("----------------------------------------");
        System.out.println(averageScore);
        System.out.println("----------------------------------------");
        float averageScore1 = 20.5f;
        System.out.println(averageScore1);
        System.out.println("----------------------------------------");
        int averageScore2 = (int)20.5;
        System.out.println(averageScore2);
            System.out.println("----------------------------------------");
            System.out.println(averageScore2);








    }
/*
class name Casting
implicit casting :
explicit casting :
 */















}
