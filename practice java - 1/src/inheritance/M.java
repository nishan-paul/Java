package inheritance;
public class M {
    public int i;
    private char c;
    protected String s;
    public void f(){
        System.out.println(i);
        System.out.println(c);
        System.out.println(s);
    }
    private void g(){
        System.out.println("Say hi to Private!");
    }
    protected void h(){
        
    }
    M(){
        i=123;
        c='A';
        s="PAUL";
    }
}
