package armstrong;
import java.util.Scanner;
public class Armstrong {
    static long f(long value){
        long sum=0;
        while(value!=0){
            long x=value%10;
            sum+= (x*x*x);
            value/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        for (long i=1; i<=n; i++){
            long x=f(i);
            if(x==i)
                System.out.println(i+" "+x);
        }
    }
}
