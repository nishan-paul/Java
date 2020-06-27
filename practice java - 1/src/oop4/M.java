package oop4;
public class M {
    int i;
    void f(){
        System.out.println("M");
    }
    M(){
        i=100;
        System.out.println("NOTHING.");
    }
    M(String s){
        i=100;
        System.out.println(s+", THANK YOU SIR!");
    }
}
