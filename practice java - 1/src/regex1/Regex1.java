package regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {    
    public static void main(String[] args){
        Pattern p = Pattern.compile("java");    
        Matcher m = p.matcher("this is java, do you know java"); 
        System.out.println( m.find() );
        System.out.println( m.group() );
        System.out.println( m.start() );
        System.out.println( m.end() + "\n" );

        System.out.println( m.find() );
        System.out.println( m.group() );
        System.out.println( m.start() );
        System.out.println( m.end() );
    }    
}