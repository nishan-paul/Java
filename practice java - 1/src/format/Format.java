package format;

import java.text.DecimalFormat;

public class Format {

    public static void main(String[] args) {
        double d=123.456789;
        DecimalFormat omg=new DecimalFormat("11.2309");
        System.out.println( omg.format(d) );
    }
    
}
