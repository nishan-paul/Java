import java.util.regex.Matcher;
import java.util.regex.Pattern;

class R {
    static void a() {
        Pattern pattern = Pattern.compile("\\d");    
        Matcher matcher = pattern.matcher( "0123456789" );    
        while( matcher.find() ) {
            System.out.println("I found the text " + matcher.group() + " starting at index " + matcher.start()+ " and ending at index "+matcher.end());    
        }
    }
    
    static void b() {
        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
    }
    
    static void c() {
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "aa"));//false (a comes more than once)
        System.out.println(Pattern.matches("[amn]", "abc"));//false (b and c are not matching pattern)
        System.out.println(Pattern.matches("[amn]", "amn"));//false (a, m, n can not come along)
    }
    
    static void d() {
        System.out.println(Pattern.matches("[789]{1}", "7"));//true
        System.out.println(Pattern.matches("[789]{1}", "77"));//false
        System.out.println(Pattern.matches("[789]{1}", "789"));//false
    }
    
    static void e() {
        System.out.println(Pattern.matches("[amn]*", "a"));//true (a or m or n may come zero or more times)  
        System.out.println(Pattern.matches("[amn]*", "aa"));//true (a or m or n may come zero or more timess)  
        System.out.println(Pattern.matches("[amn]*", "abc"));//false (b and c are not matching pattern)
        System.out.println(Pattern.matches("[amn]*", "amn"));//true (a or m or n may come zero or more times)  
        System.out.println(Pattern.matches("[amn]*", "ammnnnsamn"));//true (a or m or n may come zero or more times)
    }
    
    static void f() {
        System.out.println(Pattern.matches("\\d", "6"));//true (digit and comes once)  
        System.out.println(Pattern.matches("\\d", "122333"));//false (digit but comes more than once)  
        System.out.println(Pattern.matches("\\d", "a"));//false (char)  
        System.out.println(Pattern.matches("\\d", "7a"));//false (digit and char)
        
        System.out.println(Pattern.matches("\\D", "a"));//true (non-digit and comes once)
        System.out.println(Pattern.matches("\\D", "abbccc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "7"));//false (digit)
        System.out.println(Pattern.matches("\\D", "7a"));//false (digit and char)        
    }
}

public class f_regular_expression {
    
    public static void main(String[] args) {
        
        R.a();
        R.b();
        R.c();
        R.e();
        R.f();
        
//        Regular Expression:
//        [abc]         a, b, or c comes once
//        [^abc]	any character except a, b, or c (negation)
//        [a-zA-Z]	a through z or A through Z, inclusive (range)
//        [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
//        [a-z&&[def]]	d, e, or f (intersection)
//        [a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
//        [a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)

//        Quantifier:
//        X*	 X occurs zero or more times
//        X{n}	 X occurs n times only
//        X{n,}	 X occurs n or more times
//        X{y,z} X occurs at least y times but less than z times

//        Metacharacter:
//        .	any character (may or may not match terminator)
//        \d	any digits, short of [0-9]
//        \D	any non-digit, short for [^0-9]
//        \s	any whitespace character, short for [\t\n\x0B\f\r]
//        \S	any non-whitespace character, short for [^\s]
//        \w	any word character, short for [a-zA-Z_0-9]
//        \W	any non-word character, short for [^\w]
    }
}
