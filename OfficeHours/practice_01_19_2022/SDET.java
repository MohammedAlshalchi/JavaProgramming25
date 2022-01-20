package practice_01_19_2022;

public class SDET {
    public SDET(){
        System.out.print(1); //137113
    }

    public SDET(int number){
        this();// send you to the blank one line 4 then come to print 3 then line 15 print 7  then line 22
        System.out.print(3);
    }

    public SDET(String name){
        this(name.length()); //this(5)===>  Aygun ===> call int line 9
        System.out.print(7);
    }
}
class Team {

    public static void main(String[] args) {
        new SDET("Aygun");// call first one ===> line 14 because String one
        new SDET();
        new SDET(4);
    }
}
