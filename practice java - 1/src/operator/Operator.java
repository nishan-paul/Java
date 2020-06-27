package operator;

import java.util.Scanner;

public class Operator {
    
    public static void main(String[] args){
        int p,q;
        Scanner scan=new Scanner(System.in);
        p=scan.nextInt();
        q=scan.nextInt();
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);
        
        System.out.println(p&1);
        System.out.println(p<<2);
        System.out.println(p>>2);
        
        System.out.println(p==q?"Yes":"No");
        
        if(p>q) System.out.println("P>Q");
        else if(p==q) System.out.println("P==Q");
        else if(p<q) System.out.println("P<Q");
        
        if(p%2==0 && q%2==0) System.out.println("both EVEN");
        else if(p%2!=0 && q%2!=0) System.out.println("both ODD");
        else System.out.println("one of them");
        
        switch(p){
            case -1: System.out.println("-1"); break;
            case 0: System.out.println("0"); break;
            case +1: System.out.println("+1"); break;
            default: System.out.println("NONE OF THEM");
        }
    }
}