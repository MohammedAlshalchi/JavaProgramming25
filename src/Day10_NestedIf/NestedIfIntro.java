package Day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
     int score =95;
     if (score>=60){
         System.out.println("Passed");
     }else System.out.println("Failed");
        System.out.println("--------------------------------------------------");

int score1=400;
if (score1>=0 && score1<=100) {
    if (score1 >= 60) {
        System.out.println("Passed");
    } else {
        System.out.println("Failed");

    }
}else System.out.println("Invalid score");
        System.out.println("----------------------------------------");

int age =25;// try 19
boolean hasID=true;

if (hasID) {// main condition
    if (age >= 21) {
        System.out.println("Eligible to buy alcohol");

    } else {
        System.out.println("Not Eligible");
    }

}else  {
    System.out.println("You must have ID to buy alcohol");
}
        System.out.println("----------------------------------------");

int number =4;// try -4 ==> invalid
if (number>=1 && number<=7){
    if (number==1){
        System.out.println("Monday");
    }else if (number==2){
        System.out.println("Tuesday");
    }else if (number==3){
        System.out.println("Wednesday");
    }else if (number==4){
        System.out.println("Thursday");
    }else if (number==5){
        System.out.println("Friday");
    }else if (number==6){
        System.out.println("Saturday");
    }else {
        System.out.println("Sunday");
    }



}else {
    System.out.println("Invalid number");
}

        System.out.println("----------------------------------------");



















    }
















}
