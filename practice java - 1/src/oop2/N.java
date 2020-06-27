package oop2;
public class N extends M{
    int i;
    protected String name="PAUL";
    private String y;
    public static double d;
    protected class Joker{
        char c;
        String s;
        Joker(){
            System.out.println("CALLING FROM N (joker)");
        }
    }
    P w=new P();
    N(){
        i=200;
        System.out.println(i);
    }
}
