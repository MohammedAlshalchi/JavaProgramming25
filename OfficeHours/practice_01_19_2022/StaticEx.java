package practice_01_19_2022;

public class StaticEx {
    static void method1 () {// method woek when we call it and NO call here
        System.out.print(3);
    }

    public static void main(String[] args) {// run second
        System.out.print(5);
        //method1();    ==> when we call it here will print
    }

    static {// run first
        System.out.print(7);
    }
}
