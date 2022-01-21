package day41_Exception;

import day35_Encapsulation.encapsulation.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

//        Employee employee = null;
//
//       try {
//           System.out.println(employee.getSalary());
//
//       }catch (IndexOutOfBoundsException e){
//           System.out.println(" First catch block");
//         e.printStackTrace();
//
//
//       }catch (ArithmeticException e){
//           System.out.println("Second catch block");
//           e.printStackTrace();
//
//       }catch (NullPointerException e){
//           System.out.println("Third catch block");
//           e.printStackTrace();
//       }

        Employee employee = null;

        try {

            System.out.println(employee.getSalary()); // Null Pointer Exception

        }catch (NullPointerException e){// first one will be checked the rest will not be checked
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){// ===> we should put RuntimeException in the end Not before the other type because
            //it is the parent type and the others is child if we put it in the beginning will get error
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }


        System.out.println("Tested Completed");


        System.out.println("---------------------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }





















































    }
}
