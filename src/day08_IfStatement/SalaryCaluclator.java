package day08_IfStatement;

public class SalaryCaluclator {
    public static void main(String[] args) {
    int hourlyRate = 50,
    weeklyHours = 45;
    double stateTaxRate =6.5,
            fedralTaxRate =26.2;
    // ---------------------
        int salaryBeforeTax = hourlyRate * weeklyHours *52;
        double stateTax =salaryBeforeTax*stateTaxRate/100;
        double federalTax =salaryBeforeTax*fedralTaxRate/100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax =  salaryBeforeTax-totalTax;
        //----------------------------------------
        System.out.println("Gross pay is: $"+ salaryBeforeTax);
        System.out.println("State tax = $"+ stateTax);
        System.out.println("Federal tax"+federalTax);
        System.out.println("Total tax = $"+totalTax);
        System.out.println("Net income = $"+salaryAfterTax);
        System.out.println("-------------------------------");











    }











}
