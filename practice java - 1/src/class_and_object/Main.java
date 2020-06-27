package class_and_object;
public class Main {
    public static void main(String[] args) {
        M omg=new M();
        omg.i=123;
        omg.s="CUET";
        omg.d=1.5;
        omg.display();
        System.out.println( omg.f(12) );
        System.out.println( omg.f(3.1,12) );
        System.out.println( omg.add(1,2,4,5,6,7,11) );
        M.g();
        System.out.println(M.w);
        System.out.println(M.c);
        System.out.println(M.name);
        
        M again=new M(2,"CSE",2.74);
        System.out.println( M.cnt );
    }
}
