package day53_FunctionalInterface;

import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

  MyThirdFunctionalInterface<String>  stringReverse=
          (s)  -> {
      String reverse = new StringBuilder(s).reverse().toString();
      return reverse;


          };
String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


    MyThirdFunctionalInterface<Integer>  cubeMethod =
          (a)-> {
       /*
       MyThirdFunctionalInterface<Integer> cubeOf;
            cubeOf= (n)->{
                return(n * n * n);
                };
        System.out.println( cubeOf.method(3));
    }
        */
return (a*a*a);
            };

        System.out.println(cubeMethod.method(3));


    }
}
