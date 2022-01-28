package day42_Exceptions;


class FadyException extends RuntimeException{// unchecked exception

    public FadyException(String message){// create constructor

        super(message);

    }
//    public FadyException(){// create default constructor
//          System.out.println("It is break time");
//    }


}


class NoBreakException extends Exception {// CHECKED EXCEPTION


}

public class CustomExceptions {

    public static void main(String[] args) throws NoBreakException{

   // throw new FadyException("It is break time");
       // throw new FadyException();// ===> default print statement and it will print regular print statement

throw new NoBreakException();// OR WE can use try & catch method




    }


}
