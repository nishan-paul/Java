package overload_and_override;
public class M {
    void add(int x,int y){
        System.out.println(x+y);
    }
    int add(int x,int y, int z){
        return x+y+z;
    }
    void how(int x,int y){
        System.out.println(y*x);
    }
    public class N extends M{
        int how(int x,int y,int z){
            return (x*y*z);
        }
        void how(int x){
            System.out.println(x);
        }
        @Override
        void how(int x,int y){
            System.out.println(x+y);
        }
    }
}
