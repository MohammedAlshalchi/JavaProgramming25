package day09_IfStatements;

public class AgeGroups {
 public static void main(String[] args) {
  int age =22;
  String AgeGroup;
  if (age<=2){
   AgeGroup="infant";
  }else if (age>2&&age<=5){
   AgeGroup="Toddler";
  }else if (age>5&&age<=9){
   AgeGroup="Kid";
  }else if (age>9&&age<=12){
   AgeGroup="Pre-Teen";
  }else if (age>12&&age<=17){
   AgeGroup="Teenager";
  }else if (age>17&&age<=20){
   AgeGroup="young Adult";
  }else if (age>20&&age<=39){
   AgeGroup="Young Middle-Aged Adult";
  }else AgeGroup="Middle-Age Adult";
  System.out.println(AgeGroup);


/*
 int age = 75;

        boolean valid = age >= 0 && age <= 150;

        String result = "";

        if(valid){

            if(age >= 55){
                result = "Senior";
            }else if(age >= 21){
                result = "Adult";
            }else{
                result = "Teenager";
            }

        }else{
            result = "Invalid";
        }

        System.out.println(result);




 */































 }





















}
