package day34_GarbageCollection_AccessModifiers;

public class Constuctor_vs_StaticBlock {


    static{
        System.out.println("Static Block");

    }

public Constuctor_vs_StaticBlock(){
    System.out.println("Constructor");
}


    public static void main(String[] args) {

        new Constuctor_vs_StaticBlock(); //1
        new Constuctor_vs_StaticBlock(); //2
        new Constuctor_vs_StaticBlock(); //3
        new Constuctor_vs_StaticBlock(); //4
        new Constuctor_vs_StaticBlock(); //5
    }





  }




















































































