package day37_Inheritance.scrumTask;

public class BusinessAnalyest extends Employee{
    public BusinessAnalyest(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }


    public void document (){
        System.out.println(name+" "+" is documenting");
    }








































}
