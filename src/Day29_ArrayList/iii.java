package Day29_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class iii {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("first","second","third"));
        list.add("fourth");
        System.out.println(list);



        ArrayList <String> list1 = new ArrayList<>();
        for (int i = list.size() - 1, j=0 ; i >= 0; i-- ,j++) {
            list1.add(list.get(i)); // because arrayList is not fixed with size
            // list1.add(j,list.get(i));
        }

        System.out.println(list1);

    }
}
