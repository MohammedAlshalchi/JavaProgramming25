package day49_Collectios;

import java.util.*;

public class SetIntrofacePractice {

    public static void main(String[] args) {

       // Set<Integer> set1 = new ArrayList<>() ; ====> no relation


        Set<Integer>hasSet = new HashSet<>() ;
        hasSet.addAll(Arrays.asList(10,200,300,40,90));
        hasSet.addAll(Arrays.asList(10,200,300,40,90));
        hasSet.addAll(Arrays.asList(10,200,300,40,90));
        hasSet.addAll(Arrays.asList(10,200,300,40,90));
        hasSet.addAll(Arrays.asList(10,200,300,40,90));
        hasSet.addAll(Arrays.asList(null, null, null));

        System.out.println("HashSet = "+hasSet);// ====> just one time
        //  System.out.println( hashSet.get(4) );



        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");



        List<Integer>list = new ArrayList<>() ;
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(null, null, null));

        System.out.println("List is "+list);
            System.out.println(list.get(4));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        Set<Integer>linkHashSet = new LinkedHashSet<>() ;
        linkHashSet.addAll(Arrays.asList(10,200,300,40,90)); // keep order & NO duplicate
        linkHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkHashSet.addAll(Arrays.asList(null, null, null));
        System.out.println("List is "+linkHashSet);
       // System.out.println(linkHashSet.get(4));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");



        Set<Integer>treeSet = new TreeSet<>();// calls the method of the object and null has NO method SO will give us
        // exception

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //  treeSet.addAll(Arrays.asList(null,null,null));


        System.out.println("treeSet = " + treeSet);

        //   String str = null;
        // System.out.println(str.charAt(0));


    }









}
