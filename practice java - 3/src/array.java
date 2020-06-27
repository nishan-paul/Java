public class array {
    
    public static void main(String[] args) {
        
        int[] even = new int[5];
        even[0] = 0;
        even[1] = 2;
        even[2] = 4;
        even[3] = 6;
        even[4] = 8;
        
        int[] odd = {1,3,5,7,9};

        for(int i=0; i<5; i++) {
            System.out.println(even[i]);
            System.out.println(odd[i]);
        }
    }
}
