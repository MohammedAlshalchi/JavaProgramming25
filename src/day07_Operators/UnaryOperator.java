package day07_Operators;

public class UnaryOperator {
    public static void main(String[] args) {
    int num1 = +25;
    int num2 = -25;
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1<0);// false
        System.out.println(num2<0);// true
        System.out.println("--------------------------------------");
        int a= 5;
        // ++a pre increment : increase the value by 1 right away
        ++a;
        System.out.println(a);
        System.out.println("--------------------------------------");
        --a; // pre decrement : decrease the value by 1
        System.out.println(a);
        System.out.println("--------------------------------------");
        int b = 100;
        System.out.println(++b);
        System.out.println(b++);// post increment:first passes the current value, then increas the value by 1
        System.out.println(b);// will print 2
        System.out.println("--------------------------------------");
int x = 100;
        System.out.println(--x);// will get 99 , predecrment
        System.out.println("--------------------------------------");
        int y = 100;
        System.out.println(y--);// 100 will print
        System.out.println(y);// 99 will print
        System.out.println("--------------------------------------");
        int z=45;
        System.out.println(++z);//46... z=46 ... pre increment
        System.out.println(z++);//46.. post increment
        System.out.println(z);//47... z=47
        System.out.println("--------------------------------------");
        int q=30;
        System.out.println(--q);//29.....q=29 pre decrement
        System.out.println(q--);//29 ,,,,,, after this q=28 post decrement
        System.out.println(q);//28 .... q=28
        System.out.println("--------------------------------------");
int r=100;
int v=50;
        System.out.println(r>v);








    }












}
