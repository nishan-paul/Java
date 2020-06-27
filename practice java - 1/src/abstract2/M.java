package abstract2;

public abstract class M {
    
    abstract void f();
    
    public abstract class N{
        abstract void g();
    }
    
    public static class U extends N{
        @Override
        void g(){
            System.out.println("FROM U WITH g FUNCTION");
        }
    }
    
    public static class T extends M{
        @Override
        void f(){
            System.out.println("FROM T WITH FUNCTION f");
        }
    }
}
