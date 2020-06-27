package array_list4;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> v=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int value=sc.nextInt();
            v.add(value);
        }
        System.out.println(v);
        int value=sc.nextInt();
        boolean exist=v.contains(value);
        int idx=v.indexOf(value);
        v.set(2,value);
        int ele=v.get(1);
        System.out.println(exist);
        System.out.println(idx);
        System.out.println(v);
        System.out.println(ele);
    }
    
}
