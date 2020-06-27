package class_and_object;
public class M {
    int i;
    String s;
    double d;
    static int cnt=0;
    static float w;
    static char c;
    static String name;
    double f(double r){
        double area=Math.PI*r*r;
        return area;
    }
    double f(double p,double r){
        double area=p*r*r;
        return area;
    }
    int add(int... n){
        int sum=0;
        for(int x:n)
            sum+=x;
        return sum;
    }
    void display(){
        System.out.println(cnt);
        System.out.println(i);
        System.out.println(s);
        System.out.println(d);
    }
    static void g(){
        //we can not use non-static member in static function
//        System.out.println(i); //wrong
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.random());
    }
    static{
        w=(float) 3.1416;
        c='A';
        name="The Dark Knight";
    }
    M(){
        cnt++;
    }
    M(int i,String s,double d){
        cnt++;
        this.i=i;
        this.s=s;
        this.d=d;
    }
}
