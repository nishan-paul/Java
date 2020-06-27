package loop;
import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        for(long i=1; i<=10; i++){
            System.out.println(i*i);
        }
        long i=1;
        while(i<=1000){
            long t=(long)Math.sqrt(i);
            if(t*t==i)
                System.out.println(i);
            i++;
        }
    }
}