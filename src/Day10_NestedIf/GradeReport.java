package Day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
     /*
     90~100 Excellent
     80~89 Great
     70~79 Good
     60~69 Passed
     0~59 Failed
      */
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










































    }




































}
