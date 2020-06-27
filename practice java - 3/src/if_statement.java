public class if_statement {
    
    public static void main(String[] args) {
        int event = 0;
        int highest = 32245;
        while( event < highest) {
            if( event % 2 == 0 ) {
                System.out.println(event);
            } else {
                System.out.println("Not Even");
            }
            event += 2;
        }
    }
}
