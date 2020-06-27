package string_conversion;
public class StringConversion {
    public static void main(String[] args) {
        int i=3;
        double d=2.74;
        char c='A';
        boolean b=true;
        System.out.println( Integer.toString(i) );
        System.out.println( Double.toString(d) );
        System.out.println( Character.toString(c) );
        System.out.println( Boolean.toString(b) );
        
        String s="1";
        String t="3.1416";
        String u="A";
        String v="true";
        System.out.println( Integer.parseInt(s) );
        System.out.println( Double.parseDouble(t) );
        System.out.println( u.charAt(0) );
        System.out.println( Boolean.parseBoolean(v) );
    }
}
