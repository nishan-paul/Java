package sum_of_digits;
import java.util.Scanner;
public class SumOFdigits {
    public static void main(String[] args) {
        long value, sum=0;
        Scanner input=new Scanner(System.in);
        value=input.nextLong();
        while(value!=0){
            sum+=(value%10);
            value/=10;
        }
        System.out.println(sum);
    }
    
}
