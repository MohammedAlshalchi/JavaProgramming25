package day30_CustomClass;

public class Canacdiat {

    /*
    Attributes:
            name, id, gender, jobTitle, salary, isFullTime(boolean)

        Actions:
            toString(): to be bale to print each employee object
            setInfo(): to be able to set all the attributes
            work()...
     */

    public String name ;
    public int ID ;
    public char grender ;
    public String jobTitle ;
    public double salary;
    public boolean isFullTime ;

    public String toString() {
        return "Canacdiat{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", grender=" + grender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public void setInfo (String name, int ID, char grender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.grender = grender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
    public void work (){
        System.out.println(jobTitle+" "+name+" is working");
    }






}
