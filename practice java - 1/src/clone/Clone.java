package clone;

public class Clone {

    public static void main(String[] args) {
        M omg=new M();
        omg.i=100;
        M thanos=omg;
        System.out.println(thanos.i);
    }
    
}
