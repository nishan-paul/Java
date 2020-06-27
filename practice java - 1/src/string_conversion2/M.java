package string_conversion2;

public class M {
    int i;
    char c;
    double d;
    @Override
    public String toString(){
        String s="";
        s+=Integer.toString(i)+c+Double.toString(d);
        return s;
    }
    M(){
        i=100;
        c='A';
        d=3.1416;
    }
}
