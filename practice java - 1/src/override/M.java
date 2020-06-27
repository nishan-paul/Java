package override;
public class M extends N {
    int i;
    static double d;
    @Override
    void f(){
        super.f();
        System.out.println("calling from M");
        System.out.println(i);
        System.out.println(super.i);
        System.out.println(d);
        System.out.println(N.d);
    }
    M(){
        i=100;
        d=3.1416;
    }
}
