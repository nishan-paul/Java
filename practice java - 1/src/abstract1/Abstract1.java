package abstract1;
public class Abstract1 {
    public static void main(String[] args) {
        Shape shape;
        shape=new Triangle(10,20);
        shape.area();
        shape=new Rectangle(30,40);
        shape.area();
    }
}
