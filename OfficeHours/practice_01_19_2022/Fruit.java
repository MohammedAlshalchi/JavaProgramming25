package practice_01_19_2022;

public class Fruit {
    Juice juice;

//    {// we should put ===> public Fruit (String color ) as cosutractor
//       juice = new Juice(color);====> create juice object
//    }
//}

class Juice {// we can NOT put public class ==> just one public class in the class
    String color;

    public Juice(String color){
        this.color = color;
    }
}}
