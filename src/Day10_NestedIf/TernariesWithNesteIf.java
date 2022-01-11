package Day10_NestedIf;

public class TernariesWithNesteIf {
    public static void main(String[] args) {

        int score = 95;// try 105
        // we  can use==> String result;

        if (score>=0 && score<=100){
            if (score<=100 && score>=90){// we can remove <= 100
                System.out.println("Excellent");// result="Excellent"
            } else if (score>=80 &&score<=89){// we can remove <=89
                System.out.println("Great");// result="Great"
            }else if (score>=70 ){// we can use score >= 70 && score <= 79
                System.out.println("Good");// result ="good"
            }else if (score>=60){//score>=60 && score<=69
                System.out.println("Passed"); // result ="Passed"
            }else {
                System.out.println("Failed"); // result="Failed"
            }


        }else {
            System.out.println("InValid");// result="invalid"
        }
        System.out.println("===========================");

        int s=400;
        if (s>=0 && s<=100) {
            if (s >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");

            }
        }else System.out.println("Invalid score");
        System.out.println("----------------------------------------");






















































    }
    }



































