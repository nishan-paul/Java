package string_builder_and_buffer;
public class StringbufferStringbuilder {
    public static void main(String[] args) {
        String s="why?";
        System.out.println(s);
        s="omg";
        System.out.println(s);
        
        String y="Nishan Paul";
//        StringBuffer sb=y;
//        StringBuffer sb=new StringBuffer(y);
        StringBuffer sb=new StringBuffer("Nishan Paul");
        System.out.println(sb);
        sb.append(s);
        sb.append(24);
        sb.append(3.1416);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.setLength(4);
        System.out.println(sb);
        String x=sb.toString();
        System.out.println(x);
        
//        Any non-mutable Object, like String is thread safe
//        StringBuffer & StringBuilder are same, except StringBuffer is thread safe
//        Thread safe means a method can not be used by multiple thread at the same time 
    }
}
