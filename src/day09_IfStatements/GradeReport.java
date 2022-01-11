package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
      int score =85;
      char Grade;
      if (score>=90 && score<=100){
          Grade='A';
      }else if (score>=80 && score<=89){
          Grade='B';
      }else if (score>=70 && score<=79){
          Grade='C';
      }else if (score>=60 && score<=69){
          Grade='D';
      }else Grade='F';

        System.out.println(Grade);


















    }





















}
