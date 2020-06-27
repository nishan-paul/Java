package static_keyword;

public class N extends M{
    public static void f(){
        System.out.println("DERIVE & OVERRIDE");
    }
    public static void f(int x){
        System.out.println("DERIVE & OVERLOAD");
    }
}
