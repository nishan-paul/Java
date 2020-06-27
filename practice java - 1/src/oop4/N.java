package oop4;
public class N extends M{
    int i;
    @Override
    void f(){
        super.f();
        System.out.println("N");
    }
    void g(){
        System.out.println(10*super.i);
    }
    N(int x){
        super("PAUL");
        i=x;
        System.out.println(x*x*x);
    }
}
