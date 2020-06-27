package anonymous;

public class Anonymous {

    public static void main(String[] args) {
//        M omg=new M();
        M omg=new M(){
            void f(){
                System.out.println("JOKER");
            }
        };
        omg.f();
    }
}
