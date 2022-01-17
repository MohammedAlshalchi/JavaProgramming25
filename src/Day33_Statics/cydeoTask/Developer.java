package Day33_Statics.cydeoTask;

public class Developer extends Employee{
    /*
    4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
     */

    public Developer(String name, int age, char gender, int employeeId, String jobTiltle, double salary) {
        super(name, age, gender, employeeId, jobTiltle, salary);
    }


   public void fixingBugs() {
       System.out.println(getJobTiltle()+" "+getName()+" "+" is fixing the bug");
   }


    @Override
    public void work() {
        System.out.println(getJobTiltle()+" "+getName()+" is developing the application");
    }
}
