package Day33_Statics.cydeoTask;

public class Tester  extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTiltle, double salary) {
        super(name, age, gender, employeeId, jobTiltle, salary);
    }


    public void createTicket(){
        System.out.println(getJobTiltle() +" "+getName()+" is creating ticket");
    }

    @Override
    public void work() {
        System.out.println(getJobTiltle()+" "+getName()+" is testing the application");
    }





}






