import java.util.ArrayList;

public class g_list_class {

    
    public static void main(String[] args) {
        
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> name1 = new ArrayList<String>();
        int index = 0;
        String value = "4", value1 = "10";
        
        name.add("0");
        name.add("1");
        name.add("2");
        name.add("3");
        name.add("4");
        
        name1.add("10");
        name1.add("11");
        name1.add("12");
        name1.add("13");
        name1.add("14");
        
        System.out.println( name.size() );
        System.out.println( (boolean)name.isEmpty() );
        System.out.println( (boolean)name.equals(name1) );
        
        name.addAll( name1 );
        System.out.println( name );
        
        name.remove( index );
        System.out.println( name );
        
        System.out.println( name.indexOf(value) );
//        System.out.println( name.get( index ) );
        System.out.println( name.set( index, value1 ) );
        
        name.clear();
    }

}
