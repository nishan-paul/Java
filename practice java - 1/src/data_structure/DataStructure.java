package data_structure;
import java.util.Arrays;
import java.util.Scanner;
public class DataStructure{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=scan.nextInt();
        for(int i=0; i<n; i++)
            System.out.print(2*arr[i]+" ");
        System.out.print("\n"+arr.length+"\n");
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
    
}
