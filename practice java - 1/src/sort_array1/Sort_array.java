package sort_array1;
import java.util.*;
class SortBy1stRowValue implements Comparator<int[]> { 
    @Override
    public int compare(int[] x, int[] y) {
        return y[0]-x[0];
    }
}
public class Sort_array {
    public static void main(String[] args) {
        int[][] twoDim = { {1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3} };
        Arrays.sort(twoDim, new SortBy1stRowValue());
        System.out.println(Arrays.deepToString(twoDim));
    }
}
