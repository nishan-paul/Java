package array_list1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> v=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            String s=sc.next();
            v.add(s);
        }
        System.out.println(v);
        
        v.forEach(System.out::println);//FOR EACH
        
        for(String s:v)//FOR EACH
            System.out.println(s);
        
        v.remove(1);
        
        Iterator<String> it=v.iterator();//ITERATOR
        while(it.hasNext()==true){
            String s=it.next();
            System.out.println(s);
        }
        
        System.out.println(v.isEmpty());
        System.out.println(v.size());
        
    }
}