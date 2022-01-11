package Day01_12_04_2021;

public class StringWithoutFirstLast {
    public static void main(String[] args) {

        String str = "Hello";

/*
        str = str.substring(1,str.length()-1);
        System.out.println(str);
*/
        char First = str.charAt(0);
        char last = str.charAt(str.length()-1);

       str = str.replace(First,' ');
       str = str.replace(last,' ');

        System.out.println(str.trim());



        System.out.println("------------------------------------------");
































    }
}
