package Day33_Statics.day37_Inheritance.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTite, int id, double salary, String companyName) {
        super(name, age, gender, jobTite, id, salary, companyName);
    }


    public void fixBugs (){
        System.out.println(jobTite+" "+name+" is crying");
    }























}
