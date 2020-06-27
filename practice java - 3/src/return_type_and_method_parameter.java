class M {
    double PI;
    
    double area_circle(double r) {
        double area = PI*r*r;
        return area;
    }
    
    double volume_sphere(double r) {
        double volume = (4*PI*r*r*r)/3;
        return volume;
    }
}

public class return_type_and_method_parameter {
    
    public static void main(String[] args) {
        M calcu = new M();
        calcu.PI = 3.1416;
        System.out.println( calcu.area_circle(5) );
        System.out.println( calcu.volume_sphere(10) );
    }
}
