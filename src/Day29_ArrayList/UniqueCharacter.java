package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacter {
    public static void main(String[] args) {

String str = "aaabcccdeeef";

// String [] arr      = str.split("");// non-primitive array

// ArrayList <String> list  = new ArrayList<>(Arrays.asList( arr  );

        // we can do it directly
ArrayList <String> list  = new ArrayList<>(Arrays.asList( str.split(""))  );// new string arrayList

        System.out.println("list = " + list);// to check

String unique = "";
        for (String each : list) {
         int frequency  = Collections.frequency(list,each);
            if (frequency ==1){
                unique += each;

            }
        }
        System.out.println("unique = " + unique);






































    }
}
