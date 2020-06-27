package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Pattern p=Pattern.compile("a..d");
        Matcher m=p.matcher("abcd");
        System.out.println( m.matches() );
    }
    
}
