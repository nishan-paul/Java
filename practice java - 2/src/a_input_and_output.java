import java.util.Scanner;

public class a_input_and_output {
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner( System.in );
        
        System.out.print("Long: ");
        long lvalue = x.nextLong();
        
        System.out.print("Double: ");
        double dvalue = x.nextDouble();
        
        System.out.print("Boolean: ");
        boolean bvalue = x.nextBoolean();
        
        System.out.print("Character: ");
        char cvalue = x.next().charAt(0);
        
        System.out.print("String: ");
        String svalue = x.next();
        
        x.nextLine(); // To avoid newline overflow
        System.out.print("String (with white space): ");
        String swvalue = x.nextLine();
        
        Long u = lvalue; // conversion from primitive to wraper-class-object
        long v = u; // conversion from wraper-class-object to primitive

        System.out.printf( "Integer number %d\n", 7 ); // using format specifier
        System.out.print( "The value of PI is  " + 3.1416 + "\n" ); // print without line
        System.out.println( "The value of PI is  " + 3.1416 ); // print with line
    }
}
