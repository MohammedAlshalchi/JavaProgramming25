package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
// craete a variable that's capable enough to contain 5 elements
      String [] myGroup = new String[5];
myGroup [0] ="Mohammed";
myGroup [1] ="Dalya";
myGroup [2] ="Mariam";
myGroup [3] ="Reem";
myGroup [4] ="Rayan";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------------------------");


String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//                0         1        2            3         4        5          6
        System.out.println(Arrays.toString(days));

int number = 5;
if (number <1 || number > 7){
    System.err.println("Invalid");
    System.exit(0);
}

        System.out.println(days[number-1]);






















    }
}
