package oop5;
public class M {
    int i;
    char c;
    String s;
    M(){
        i=100;
        c='A';
        s="CUET";
    }
    void f(){
        this.i=200;
        this.c='B';
        this.s="CSE";
    }
    void display(){
        System.out.println(i+" "+c+" "+s);
    }
}
