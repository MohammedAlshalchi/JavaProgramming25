package Day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int num =9; // try 15
        String month;
        if (num>=1 && num<=12){
            if (num==1){
                month="January";
            } else if (num==2){
                month="February";
            }else if (num==3){
                month="March";
            }else if (num==4){
                month="April";
            }else if (num==5){
                month="May";
            }else if (num==6){
                month="June";
            }else if (num==7){
                month="July";
            }else if (num==8){
                month="August";
            }else if (num==9){
                month="September";
            }else if (num==10){
                month="November";
            }else {
                month="December";
            }






        }else {
            month="InValid";
        }

        System.out.println(month);

        System.out.println("----------------------------------------------------");

int n = 5;
       String name= n==1 ? " Jan" : (n==2)? "Feb" : (n==3) ? "March" : (n==4) ? "April" : (n==5) ?"May" : (n==6)?"June"

:(n==7)?"July" :(n==8)?"August":(n==9)?"Sep":n==10?"Oct":(n==11)?"Nov":"Dec";// we can do it without ( )

        System.out.println(name);
        System.out.println("----------------------------------------------------");










































































    }



























}
