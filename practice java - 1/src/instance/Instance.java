package instance;
public class Instance {
    public static void main(String[] args) {
        Circle joker=new Circle();
        Cylinder thanos=new Cylinder();
        Box hannibal=new Box();
        
        System.out.println( joker instanceof Circle );//
        System.out.println( joker instanceof Cylinder );
        System.out.println( joker instanceof Box );
        
        System.out.println( thanos instanceof Circle );
        System.out.println( thanos instanceof Cylinder );//
        System.out.println( thanos instanceof Box );
        
        System.out.println( hannibal instanceof Circle );
        System.out.println( hannibal instanceof Cylinder );
        System.out.println( hannibal instanceof Box );//
    }
}
