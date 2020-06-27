package exception4;

import java.io.IOException;

public class M {
    public static void main(String[] args) throws IOException {
        int x=10;
        int y=0;
        if(y==0)
            throw new IOException("WHY SO SERIOUS?");
        else{
            int z=x/y;
            System.out.println( z );
        }
    }
}
