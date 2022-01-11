package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList <String> employees = new ArrayList(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel"
                ,"Aaron","Ahmed","David"));
        System.out.println(employees);
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David"));

       employees.retainAll(Arrays.asList("Ahmed","David"));// converting to collection to use retainsAll

        System.out.println(employees);


String [] employees1 = employees.toArray(new String[0]);// Converting ArrarList to array
        System.out.println(Arrays.toString(employees1));


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );//converting array to arrayList

        list.removeIf( p -> p.charAt(0) == 'M' );

        names = list.toArray(new String[0]);// converting arrayList to array

        System.out.println(Arrays.toString(names));





































































    }
}
