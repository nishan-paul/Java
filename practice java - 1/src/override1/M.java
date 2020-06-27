package override1;
public class M {
    public void f(){
        System.out.println("M");
    }
    public void g(){
        System.out.println("M : G");
    }
    public class T extends M{
        @Override
        public void g(){
            System.out.println("T : G");
        }
    }
}