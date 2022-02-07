package day44_Abstraction.animalTask;

public interface Playable {// it is interface NOT a class (supper type )

    // we should use public access modefier BECAUSE it is ===> 100% abstraction

    //public abstract void play ();
   // abstract void play ();

    void play();// abstract by default

    //static boolean isfriendly;=====> we should initialized
    //static boolean isfriendly= true;=== we can

    boolean isfriendly= true;// this is a variable





}
