package string_conversion2;

import java.util.Arrays;

public class Tostring {

    public static void main(String[] args) {
        String s=1+2+3+"paul"+'c';
        System.out.println( s );
        String t="paul"+1+2+3+'c';
        System.out.println( t );
        int[] a={1,2,3};
        System.out.println(Arrays.toString(a));
        M omg=new M();
        System.out.println( omg.toString() );
    }
    
}
