package day50_collections_Map;




import java.util.*;

public class RemovDuplicated {
/*
    3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order
 */

    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4));

        //solution1
        List<Integer> list1 = new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println(list1


        );
        //solution 2:
        List<Integer> list2 = new ArrayList<>();
        for (Integer each : list) {
            if(!list2.contains(each))
                list2.add(each);
        }
        System.out.println(list2);
        // solution3


        List<Integer> list3 = new ArrayList<>();
        list.forEach( p -> {if(!list3.contains(p)) list3.add(p);});


        System.out.println(list3);


    }







}
