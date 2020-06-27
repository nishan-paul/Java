package pallindrome;
import java.util.Scanner;
public class Pallindrome {
    static long f(long value){
        long sum=0;
        while(value!=0){
            sum=10*sum+value%10;
            value/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long value=input.nextLong();
        long number=f(value);
        System.out.println(number);
    }
    
}
