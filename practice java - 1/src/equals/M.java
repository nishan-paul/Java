package equals;

public class M {

    public static void main(String[] args) {
        N omg=new N();
        N thanos=new N();
        N joker=new N();
        N lecter=joker;
        omg.i=100;
        thanos.i=100;
        joker.i=200;
        System.out.println( omg.equals(thanos) );
        System.out.println( lecter.i );
        System.out.println( omg==thanos );
        System.out.println( lecter==joker );
    }
    
}
