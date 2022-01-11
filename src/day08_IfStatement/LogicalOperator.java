package day08_IfStatement;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 19;  // try with 14
        String citizen = "UK";
        String name = "Steven";
        boolean isEligible = age >= 18  && citizen == "USA";
        // 19>=18 && USA == UK
        // true && false ======> false
        System.out.println(name+" is eligible to vote "+isEligible);
        System.out.println("---------------------------");
String name2 = " Josh ";
int cridetscoore = 720;
int age2 = 23;
int income = 40000;
boolean isEligible2 = cridetscoore >=700 && age2 >=21 && income>60000;// one false==>false
        System.out.println(name2+" is eligible "+ isEligible2);
        System.out.println("---------------------------");
        String name3 = "Shay";// selective service
        int age3 = 21;
        char gender= 'F';
        boolean isEligible3 = age3>= 18 && ( gender == 'M'||gender=='F');
        // 21>=18 && ( 'F'== || 'F' =='F')
        // true && ( false || true )
        //true && true
        // true
        System.out.println(name3 +" is eligible to register: "+ isEligible3);
        System.out.println("---------------------------");
        String name4 ="James";
        boolean marriedToUSCitizen = false;
        String countryBirth = "USA";
        boolean isEligible4 = countryBirth=="USA"|| marriedToUSCitizen==true;
        // true
        System.out.println(name4+" is eligible to apply for US citizenShip: "+ isEligible4);
        System.out.println("---------------------------");
        System.out.println("----------------------------------------");
String student = " Ana ";
double GPA =3.5;
int familyIncome = 100000;
boolean isEligible5 = GPA >= 3.5 || familyIncome<= 60000;
        System.out.println(student+" is eligible for scholarship: "+isEligible5);
        System.out.println("----------------------------------------");
boolean resulte2 =true ;
        System.out.println("result2 = "+resulte2);
        System.out.println("----------------------------------------");
boolean resulte3 =!resulte2;
        System.out.println("resulte3 = " + resulte3);
        System.out.println("----------------------------------------");
int score =85;
boolean passed = score>=60;
boolean failed =!passed;
        System.out.println("passed = "+passed);
        System.out.println("failed = "+ failed);


    }












}
