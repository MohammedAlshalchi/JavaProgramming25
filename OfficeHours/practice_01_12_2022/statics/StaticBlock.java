package practice_01_12_2022.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

    public static int num;//public static int num= 10; ===> same but mor difficult when we have big data
    public static ArrayList <String> carModels;

    static {
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Toyota","BMW","Ford","Honda"));


    }


    public StaticBlock (){
        System.out.println(" no org");
        num += 5;
    }

   public StaticBlock (int value) {
       System.out.println("One param consutractor ");
num += value;
   }











}
