package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int puplicData = 100;
    static int defaultData = 200; // default modifier has NO keys  // access modifier : default

    private static int priveData = 300;


    public static void main(String[] args) {
        System.out.println(puplicData);
        System.out.println(defaultData);
        System.out.println(priveData);
    }

    public static void method1 (){
        System.out.println("Public");
    }
static void method2 (){
    System.out.println("Default");
}
private static void method3 () {
    System.out.println("Private");
}

}
