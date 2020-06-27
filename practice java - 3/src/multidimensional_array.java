import java.util.Scanner;

public class multidimensional_array {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] man = new int[3][2];

        for(int i=0; i<man.length; i++) {
            for(int j=0; j<man[i].length; j++) {
                man[i][j] = input.nextInt();
            }
        }
        
        for(int[] man1 : man) {
            for (int j = 0; j < man1.length; j++) {
                System.out.print(man1[j]);
            }
            System.out.println("");
        }
    }
}
