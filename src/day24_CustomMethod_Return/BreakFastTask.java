package day24_CustomMethod_Return;

public class BreakFastTask {
    public static void main(String[] args) {
Initials("moHamMed" , "aLsHalChi");
domain("Cydeo@yahoo.com");
nameOfMonth(10);
nameOfDay(3);
DaysInMonth("january");

    }
    /*
  . Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


     */
public static void Initials (String firstName, String lastName){
   String initial = firstName.charAt(0)+"."+lastName.charAt(0);
   initial =initial.toUpperCase();
    System.out.println("Intial is: "+initial);


}

public static void domain (String email){

   String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));
    System.out.println("Domain is: "+domain);
}

    public static void nameOfMonth(int number){

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }

public static void nameOfDay (int number){
    switch (number){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
    }


}

public static void DaysInMonth (String month){

    if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("March")
            || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July")
            || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October")
            || month.equalsIgnoreCase("December")){
        System.out.println(month + " has 31 days");
    }else if (month.equalsIgnoreCase("February")){
        System.out.println(month + " has 28 days");
    }else {
        System.out.println(month + " has 30 days");
    }

}





}














































