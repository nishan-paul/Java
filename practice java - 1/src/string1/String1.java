package string1;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        String s="Nishan Paul";
        String t=new String("Nishan Paul");
        if(s==t)
            System.out.println("s==t");
        else
            System.out.println("s!=t");
        System.out.println( s.equals(t) );
        String u="Paul";
        System.out.println( s.contains(u) );
        System.out.println( s.length() );
        String a="Anisul", b="anisul";
        System.out.println( a.equalsIgnoreCase(b) );
        System.out.println( a.isEmpty() );
        System.out.println( a.concat(b) );
        System.out.println( a.toUpperCase() );
        System.out.println( a.toLowerCase() );
        System.out.println( a.startsWith("Ani") );
        System.out.println( a.endsWith("A") );
        System.out.println( a.charAt(3) );
        System.out.println( a.codePointAt(0) );
        System.out.println( a.indexOf("n") );
        System.out.println( a.lastIndexOf("is") );
        String x=" Paul CUET CSE Paul PAUL ";
        System.out.println( x.trim() );
        System.out.println( x.replace("Paul", "Nishan") );
        String[] arr=x.split(" ");
        System.out.println( Arrays.toString(arr) );
    }
}
