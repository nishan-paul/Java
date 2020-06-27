import java.util.Arrays;

class B {
    
    static void string_class() {
        String name = "HelloFromTheOtherSide";
        String name1 = "HelloFromTheOtherSide";
        String name2 = "Hello";
        String name3 = "Prestige";
        
        int index = 0;
        
        System.out.println( name.length() );
        System.out.println( name.equals(name1) );
        System.out.println( name.contains(name1) );
        System.out.println( name.isEmpty() );
        System.out.println( name.concat(name1) );
        System.out.println( name.toUpperCase() );
        System.out.println( name.toLowerCase() );
        System.out.println( name.toCharArray() );
        System.out.println( name.startsWith(name1) );
        System.out.println( name.endsWith(name1) );
        System.out.println( name.charAt(index) );
        System.out.println( name.codePointAt(index) );
        System.out.println( name.indexOf(name2) );
        System.out.println( name.lastIndexOf(name2) );
        System.out.println( name.trim() );
        System.out.println( name.replace(name2, name3) );
        
        String s1=new String("hello");
        String s2="hello";  
        String s3=s1.intern();
        System.out.println( s1==s2 );
        System.out.println( s3==s2 );
        
        String s4="welcome to split world";
        System.out.println( Arrays.toString( s4.split("\\s") ) );
        System.out.println( Arrays.toString( s4.split("\\s",2) ) );

        System.out.println("");
    }
    
    static void stringbuffer_class() {
        StringBuffer name = new StringBuffer("HelloFromTheOtherSide");
        StringBuffer name1 = new StringBuffer("HelloFromTheOtherSide");
        
        int index = 0, start = 0, end = 2, number = 10;
        
        System.out.println( name.length() );
        System.out.println( name.equals(name1) );
        System.out.println( name.charAt(index) );
        System.out.println( name.codePointAt(index) );
        
        name.append(name1);
        System.out.println( name );
        
        name.delete(start, end);
        System.out.println(name);
        
        name.reverse();
        System.out.println( name );
        
        name.setLength(number);
        System.out.println( name);
    }
}

public class e_string_class {
    
    public static void main(String[] args) {
        
        B.string_class();
        
        B.stringbuffer_class();
    }
}
