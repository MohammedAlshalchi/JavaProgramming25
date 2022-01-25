package utilities;

import day32_Constructor.day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        //System.out.println(AccessModifiers_Test4.name1); ===> DEFAULT NOT VISIBLE outside package

        System.out.println(AccessModifiers_Test4.name2);  // protected is visible outside package


       // AccessModifiers_Test4.method1(); ==> not visible
        AccessModifiers_Test4.method2();
































    }
}
