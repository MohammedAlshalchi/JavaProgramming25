package day50_collections_Map;



import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*
 2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions
 */
public class RemoveEven {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100, 90, 80, 75, 45, 35, 25, 15));

        //  set.removeIf( p -> p %2 ==0);

        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            if(it.next() %2 ==0){
                it.remove();
            }
        }

        System.out.println(set);
    }



}
