package reverse_number;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        long value, sum=0;
        Scanner input=new Scanner(System.in);
        value=input.nextLong();
        while(value!=0){
            sum=10*sum+value%10;
            value/=10;
        }
        System.out.println(sum);
    }
    
}
