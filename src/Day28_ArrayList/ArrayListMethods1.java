package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList <Integer> numbers  = new ArrayList<>();
numbers.add(10); // outboxing
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
numbers.add(2,25); // VERY useful
numbers.add(5,45);
numbers.add(100); // will be added at the end of array
        numbers.add(2);
        System.out.println(numbers);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println(numbers.size());

int lastIndex = numbers.size()-1;

        System.out.println("last index is: "+lastIndex);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


//int num= numbers.get(3);

        //System.out.println("num 3 ="+num);

 Integer num1    = numbers.get(3);

        System.out.println("num 3 ="+num1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");



        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

employees.remove(1);

        System.out.println(employees);

employees.remove(employees.size()-1);
        System.out.println(employees);

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        employees.remove("Hulya"); //

        System.out.println(employees);
        employees.remove("Neira");
        System.out.println(employees);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(list.size());
list.clear();

        System.out.println(list.size());


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

ArrayList <Character> characters = new ArrayList();


        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
int a = characters.indexOf('A');
int b = characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


        boolean r3 =  characters.contains('A');

        boolean r4 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("--------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        System.out.println("--------------------------------");

boolean r5      = list1.isEmpty();
        System.out.println("r5 ="+r5);

        System.out.println("--------------------------------");

  list1.clear();

      boolean r6 = list1.isEmpty();

        System.out.println("r6 = "+r6);

        System.out.println("----------------------------------");

        ArrayList <Integer> MMNN = new ArrayList<>();
        //Bulk Operation: CollectionType
        MMNN.addAll(Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);
















    }
}
