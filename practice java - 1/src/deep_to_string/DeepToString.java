package deep_to_string;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int arr[][][] = { { {1,2}, {3,4} }, { {5,6}, {7,8}}  };
        System.out.println( Arrays.deepToString(arr) );
    }
}
