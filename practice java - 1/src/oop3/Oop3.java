package oop3;

import java.util.Arrays;

public class Oop3 {
    public static void main(String[] args) {
        M omg=new M();
        omg.i[1]=100;
        System.out.println( Arrays.toString(omg.i) );
//        omg.s="NISHAN";
        System.out.println( omg.s );
    }
}
//any member can use all other members in the same class
//default/public/protected member can be inherited
//private member can not be inherited & only exists in the class (can not be called by object)
//public member can be accessed from same package & other packages  
//default member can be accessed from same package only 
//protected member can be accessed from same package & other packages (only by child class)  
//[ here, member means variable, function, class, object  ]

//final variable, can not be changed
//final function, can not be overridden
//final class, can not inherited
//[ does not make impact on final object ]

//this refers current class
//super refers super class

//instance variable (defined in class & object based)
//static variable (defined in class & class based)
//local variable (defined in function)
//[function can be static also]