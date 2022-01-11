package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
     String name ="Josh";
     int age = 38 ;
     String citizn = "USA";
     boolean isEligible =age>=21 && citizn=="USA";
     // Eligible
        if (isEligible){
            System.out.println("Eligible");
        }
        // Not Eligilble
        if (!isEligible){
            System.out.println("Not Eligible");
        }








    }







}
