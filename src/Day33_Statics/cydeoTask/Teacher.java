package Day33_Statics.cydeoTask;

public class Teacher extends Employee{
    /*
    5. Create a sub class of Employee named Teacher
            Override the work method
     */

    public Teacher(String name, int age, char gender, int employeeId, String jobTiltle, double salary) {
        super(name, age, gender, employeeId, jobTiltle, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTiltle()+" "+getName()+" is teaching");
    }
}
