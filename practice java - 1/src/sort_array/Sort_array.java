package sort_array;
import java.util.Arrays;
import java.util.Scanner;
public class Sort_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] omg=new int[5];
        for(int i=0; i<5; i++)
            omg[i]=sc.nextInt();
        Arrays.sort(omg);
        for(int i=0; i<5; i++)
            System.out.print(omg[i]+" ");
        System.out.println(Arrays.toString(omg));
    }
    
}
