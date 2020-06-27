package abstract0;

public abstract class M {

    protected int i;
    abstract void f();

    public static class N extends M{
        @Override
        void f(){
            i=100;
            System.out.println(i);
            System.out.println("REAL");
        }
    }

}
