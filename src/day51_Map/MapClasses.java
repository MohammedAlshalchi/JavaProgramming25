package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

       // Map<Integer,String> map1 = new ArrayList<>(); we can not: NO relation and we can not use 2
       // parameters

        Map<Integer,String> hashMap= new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        System.out.println("HashMap = "+hashMap);
        // if we add hashMap.put(5, "Ahmet"); will remove Isabell and print (5, "Ahmet")

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);




        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        // treeMap.put(null, "Hulya");

        System.out.println("treeMap = " + treeMap);



        Map<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //  hashtable.put(null, "Hulya");

        System.out.println("hashtable = " + hashtable);



    }






}
