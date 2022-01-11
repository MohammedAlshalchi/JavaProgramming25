package Day11_Switch_Scanner;

public class taxRate {
    public static void main(String[] args) {

double salary=75_000;
boolean isMarried =true;
double taxRate=0;

if (salary>=130000){// false ==> salary <130000
   taxRate=0.35;
}else if (salary>=100000){
    taxRate=0.3;
}else if (salary>=80000){
    taxRate=0.25;
}else {
    taxRate=0.2;
}
if (isMarried){
    taxRate-=0.05;
        }



double salaryAfterTax =salary-(salary*taxRate);

        System.out.println("Salary After= "+ salaryAfterTax);





    }






}
