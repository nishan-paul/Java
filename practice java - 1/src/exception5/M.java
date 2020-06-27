package exception5;

public class M {
    public static void main(String[] args) throws N {
        try{
            throw new N();
        }
        catch(N e){
            System.out.println( e.i );
            System.out.println( e.s );
        }
    }
}

