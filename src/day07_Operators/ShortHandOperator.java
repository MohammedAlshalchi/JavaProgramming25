package day07_Operators;

public class ShortHandOperator {
    public static void main(String[] args) {
        // assignment: =
        int number = 100;
        System.out.println("number = " + number);
        System.out.println("---------------------------");
        number=200;// we can not write int number =200
            System.out.println("number = " + number);
        System.out.println("---------------------------");
        String word =" Java Programming";
        System.out.println("word = " + word);// will print word = Java Programming
        System.out.println("---------------------------");
word="Wooden Spoon";// we can not do : word=100
        System.out.println("word = " + word);//will print word = Wooden Spoon
        System.out.println("---------------------------");
        word ="123"+1;// very important will print 1231
            // can not word = 123
        System.out.println("word = " + word);
        System.out.println("---------------------------");
// Addition assignment
        int x= 100;
        System.out.println("x = " + x);
        System.out.println("---------------------------");
        System.out.println(x+200);// will print 300 but x still 100
        System.out.println("---------------------------");
x=x+200;
        System.out.println("x = " + x); // x will be 300
        System.out.println("---------------------------");
        //x+=200.... shortcut
        x+=200;
        System.out.println("x = " + x);
        System.out.println("---------------------------");
String str = "Wooden";
str +="Spoon"; // just for + we can not use for -
        System.out.println("str = " + str); // str = WoodenSpoon
        System.out.println("---------------------------");
double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1+=5.5;
        System.out.println("num1 = " + num1);
        System.out.println("---------------------------");
double availableBalance = 1000.50;// deposite 300$
            availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("---------------------------");
// withdrawing 500$
        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("---------------------------");
        availableBalance-=200;// withdraw 200$ then deposit 400$
        availableBalance+=400;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("---------------------------");
        double salary = 50000.50;
        salary*=2;//salary = salary * 2    ... same
        System.out.println("salary = " + salary);
        double doge =0.0000001;
        doge *=1000000;
        System.out.println("doge = " + doge);
        System.out.println("---------------------------");
        double num2 =25000;
        num2 /=2;
        System.out.println("num2 = " + num2);
        System.out.println("---------------------------");
        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);// will print 1.0
        System.out.println("---------------------------");
        int amount = 127; // cents
        int quarters =127/25;
        int cents =127%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("---------------------------");
        int cents2 =127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2);
        System.out.println("---------------------------");
int y= 300;
y%=61;
        System.out.println("y = " + y);
        System.out.println("---------------------------");
        int balance = 3500; // insurance fee = $153 continuous paying 153 until it's not enough
        balance %=153;// the money remain in the bank
        System.out.println("balance = " + balance);


    }

}
