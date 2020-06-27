package string_conversion1;
public class StringConversion1 {
    public static void main(String[] args) {
        int i=123;//decimal
        System.out.println( Integer.toString(i, 2) );
        System.out.println( Integer.toString(i, 8) );
        System.out.println( Integer.toString(i, 16) );
        
        System.out.println( Integer.parseInt("111", 2) );
        System.out.println( Integer.parseInt("111", 10) );
        System.out.println( Integer.parseInt("177", 8) );
        System.out.println( Integer.parseInt("179", 10) );
        System.out.println( Integer.parseInt("ABF9", 16) );
    }
    
}
