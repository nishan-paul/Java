package internationalization;

import java.util.Locale;

public class Internationalization {

    public static void main(String[] args) {
        
//        Locale locale=Locale.getDefault();  
        Locale locale=new Locale("id","id");//for the specific locale  

        System.out.println(locale.getDisplayCountry());  
        System.out.println(locale.getDisplayLanguage());  
        System.out.println(locale.getDisplayName());  
        System.out.println(locale.getISO3Country());  
        System.out.println(locale.getISO3Language());  
        System.out.println(locale.getLanguage());  
        System.out.println(locale.getCountry());  

    }
}