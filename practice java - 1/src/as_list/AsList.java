package as_list;
import java.util.Arrays;
import java.util.Collections;

public class AsList {
    public static void main(String[] args) {
        Integer ar[] = {1,2,3,4,5};
//        int ar[] = {1,2,3,4,5}; //wrong
        Collections.reverse( Arrays.asList(ar) );
        System.out.println( Arrays.toString(ar) );
    }
}