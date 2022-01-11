package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

      String []  countries = {"Japan","Korea","United State","United Kingdom","Canada"};

      // converting array to arrayList BECAUSE we do not have remove method in array

        ArrayList <String> list = new ArrayList <> (Arrays.asList(countries));

        list.removeIf( p -> p.length() >= 10);//length of word less than 10

        // converting arrayList to array
        countries = list.toArray(new String[0]);// or we can give any number IT will replace with size of list BUT
// should not be more than list size

        System.out.println(Arrays.toString(countries)); // printing array

/*Extra explain
String [] countries={} ;

ArrayList <String> list = new ArrayList<>(Arrays.asList("Japan","Korea","United State","United Kingdom","Canada"));
        System.out.println(list);// print ArrayList

       list.removeIf(p -> p.length() >=10 );
        System.out.println(list);

      // countries = list.toArray(new String[0]);

      //  System.out.println(Arrays.toString(countries));

 */
































    }
}
