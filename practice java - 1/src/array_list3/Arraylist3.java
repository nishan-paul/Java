package array_list3;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist3 {
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
        u.addAll(v); System.out.println(u);
        w.addAll(v); System.out.println(w);
        v.remove(2);
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }
}
