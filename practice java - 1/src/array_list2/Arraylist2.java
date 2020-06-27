package array_list2;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> u=new ArrayList<>(), v=new ArrayList<>(), w=new ArrayList<>();
        for(int i=0; i<5; i++)
            u.add(i+1);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int value=sc.nextInt();
            v.add(value);
        }
        System.out.println(v.isEmpty());
        System.out.println(v.size());
        System.out.println(u.equals(v));
    }
}
