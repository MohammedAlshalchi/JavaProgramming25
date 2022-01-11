package Day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
      String browserName = "chrome";
String result="";
boolean validName= browserName=="safari" || browserName=="chrome" || browserName=="firefox"|| browserName=="opera"||
        browserName=="edge";
      if (validName){
         if (browserName=="chrome"){
             result= "chromw";
         }else if (browserName=="firefox"){
           result="firefox";
         }else if (browserName=="opera"){
             result="opera";
          }else {
             result="edge";
         }





          }else {
          result="Invalid browser Name";
      }


        System.out.println(result);









      }













































    }










































