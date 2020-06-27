package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {
        Pattern p=Pattern.compile("a..x.z");
        Matcher m = p.matcher("abcxyz");
        System.out.println( m.matches() );
        
        p = Pattern.compile("[abc]");
        m = p.matcher("a");
        System.out.println( m.matches() );
        
        p=Pattern.compile("[^abc]");
        m = p.matcher("x");
        System.out.println( m.matches() );
        
        p = Pattern.compile("[a-e]");
        m = p.matcher("f");
        System.out.println( m.matches() );
        
        p = Pattern.compile("[a-eA-E]");
        m = p.matcher("E");
        System.out.println( m.matches() );
        
        p = Pattern.compile("[a-z&&[d-h]]");
        m = p.matcher("a");
        System.out.println( m.matches() );
        
        p = Pattern.compile("[a-z&&[^d-h]]");
        m = p.matcher("a");
        System.out.println( m.matches() );
        
        p=Pattern.compile("[abc]+");
        m = p.matcher("");
        System.out.println( m.matches() );
        p=Pattern.compile("[abc]+");
        m = p.matcher("abcabc");
        System.out.println( m.matches() );
        p=Pattern.compile("[abc]+");
        m = p.matcher("abcdf");
        System.out.println( m.matches() );
        
        p=Pattern.compile("[abc]*");
        m = p.matcher("");
        System.out.println( m.matches() );
        p=Pattern.compile("[abc]*");
        m = p.matcher("abcabc");
        System.out.println( m.matches() );
        p=Pattern.compile("[abc]*");
        m = p.matcher("abcdf");
        System.out.println( m.matches() );
        
        p = Pattern.compile("\\d");
        m = p.matcher("1");
        System.out.println( m.matches() );
        p = Pattern.compile("\\D");
        m = p.matcher("f");
        System.out.println( m.matches() );
        
        p = Pattern.compile("\\s");
        m = p.matcher("\t");
        System.out.println( m.matches() );
        p = Pattern.compile("\\S");
        m = p.matcher("f");
        System.out.println( m.matches() );
        
        p = Pattern.compile("\\w");
        m = p.matcher("1");
        System.out.println( m.matches() );
        p = Pattern.compile("\\W");
        m = p.matcher("f");
        System.out.println( m.matches() );
    }
    
}
