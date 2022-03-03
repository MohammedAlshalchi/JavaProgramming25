package day52_Map_functionlInterface;

public class Test {

    public static void main(String[] args) {

//function1: create a function that can display if a number is odd or even
MyFirstFunctioalInterface oddNumberOrEven = (n) -> {
    if (n %2 ==0 ){
        System.out.println(n +" n is even number");

    }else { System.out.println(n +" n is odd number");}
};
 oddNumberOrEven.apply(20);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//function2: create a function that can check if a person is eligible to buy an alcohol
MyFirstFunctioalInterface eligibleToBuyAlcohol;
eligibleToBuyAlcohol = age -> {  // one parameter NO need for ()
    if (age >= 21){
        System.out.println("Eligible to buy alcohol");

    }else { System.out.println("Not eligible to buy alcohol");}

};
eligibleToBuyAlcohol.apply(40);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//function3: create a function that can display the cube of a number



       MyFirstFunctioalInterface cubeOfANumber= (r)->
            System.out.println("the cubic volume: "+r*r*r); // no need for {} because one statement


        cubeOfANumber.apply(4);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//function4: create a function that can check if a number is evenly divisble by  3 & 5

       MyFirstFunctioalInterface divisibleBy3And5 =  n -> {
            if(n % 15 ==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);

























    }















}
