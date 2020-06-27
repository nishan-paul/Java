package array_sort_collection_sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//ARRAYS && LIST
//LIST: ArrayList && LinkedList
//EVERY PRIMITIVE DATA TYPE HAS WRAPPER CLASS, for example:
//int-Integer, long-Long, float-Float, double-Double, boolean-Boolean, byte-Byte, char-Char
//Arrays class works with only array && Collection class works with only list

public class array_sort_collection_sort{
    
    public static void main(String[] args){
        int[] a={9,6,8,10,7};
        Arrays.sort(a, 0, 5);
        Integer[] a1={4,5,1,3,2};
        Arrays.sort(a1, 0, 5, Collections.reverseOrder());
        ArrayList<Integer> omg=new ArrayList<>(Arrays.asList(a1));
        Collections.reverse(omg);
        System.out.println(Arrays.toString(a1));
        
        Integer[] temp={13,11,15,12,14};
        ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(temp));
        Collections.sort(a2);
        Collections.reverse(a2);
        System.out.println(a2);
    }
}
