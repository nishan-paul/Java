package array_2d;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(2*arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
