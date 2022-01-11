package day09_IfStatements;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        int age = 24;
        String crime = "Clear";

        if (age >= 21 && crime == "Clear") {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");


        }

    }
}