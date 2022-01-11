package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {

    Car car1 = new Car();
    car1.setInfo("Toyota","Camary","White",2021,3000);
    System.out.println("car1 : "+car1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Car car2 = new Car();
        car2.setInfo("BMW","Xdrive","Red",2020,35000);
        System.out.println("car2 : "+car2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Car car3 = new Car();
        car3.setInfo("Merceedce","GLA250","Red",2018,42000);
        System.out.println("car3 : "+car3);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

Car [] cars = {car1,car2,car3};
System.out.println("Csrs : "+Arrays.toString(cars));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        ArrayList <Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carsList);
        for (Car each : carsList) {
            System.out.println(each.brand+" : "+each.price);
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

 /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);


        System.out.println(carsList);




    }



}












