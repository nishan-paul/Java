package exception1;

public class M {

    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            int z=x/y;
            System.out.println( z );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("WHY?");
        }
        System.out.println("HOW?");
    }
    
}
