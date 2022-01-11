package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

//int num = 1; ==> by index
//list.remove(num);
       // System.out.println(list);

Integer num = 200; // ===> by object

boolean r= list.remove(num); // just for element

        System.out.println(list);
        System.out.println(r);
















































    }
}
