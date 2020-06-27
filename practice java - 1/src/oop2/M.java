package oop2;
public class M {
    public int i;
    void stroke(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.random());
    }
    protected class Joker{
        char c;
        String s;
        Joker(){
            System.out.println("CALLING FROM M (joker)");
        }
    }
    M(){
        i=100;
    }
}
