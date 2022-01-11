package day30_CustomClass;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Canacdiat can1 =new Canacdiat();
        can1.setInfo("Ali",50,'F',"Manegar",50000,true);

        Canacdiat can2 = new Canacdiat();
        can2.setInfo("Mariam",100,'M',"Casher",40000,false);

        Canacdiat can3 =new Canacdiat();
        can3.setInfo("Reem",150,'F',"FrontDesk",45000,true);

        Canacdiat can4 =new Canacdiat();
        can4.setInfo("Rayan",20,'M',"PO",70000,true);

        Canacdiat can5 =new Canacdiat();
        can5.setInfo("Mohammed",10,'M',"CEO",80000,false);

        Canacdiat [] Bank =  {can1,can2,can3,can4,can5};

        System.out.println(Arrays.toString(Bank));
can4.work();


int countFullTime = 0;
int countPartTIME= 0;
double maxSalary = Bank[0].salary;
double minSalary = Bank[0].salary;


        for (Canacdiat each : Bank) {
            if (each.isFullTime){
                countFullTime ++;
            }else {
                countPartTIME ++;
            }
            if (each.salary > maxSalary){
                maxSalary = each.salary;
            }
            if (each.salary < minSalary){
                minSalary = each.salary;
            }
        }
        System.out.println("Number of full time is : "+countFullTime);
        System.out.println("Number of part time is : "+countPartTIME);
        System.out.println("Max salary is :"+maxSalary);
        System.out.println("Min salary is :"+minSalary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        AbstractList <Canacdiat> arr = new ArrayList<>(Arrays.asList(Bank));
        System.out.println("ArrayList is : "+arr);
arr.removeIf(p -> p.name.charAt(0) == 'M');
        System.out.println("ArrayList is NEWWWWW : "+arr);




        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("bANK ARRAY IS :"+Arrays.toString(Bank));


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


Bank =arr.toArray(arr.toArray(new Canacdiat[0]));

        System.out.println("vERY NEW IS : "+Arrays.toString(Bank));



































    }












































}
