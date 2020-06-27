import java.util.Scanner;

public class switch_statement {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        
        switch(command) {
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                break;
            case "d":
                System.out.println("d");
                break;
            default:
                System.out.println("Bye");
        }
    }
}
