import java.util.Scanner;

public class get_user_input {
    
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Integer: ");
        int a = input.nextInt();
        System.out.print("Double : ");
        double b = input.nextDouble();
        System.out.print("String : ");
        String c = input.next();
    }
}
