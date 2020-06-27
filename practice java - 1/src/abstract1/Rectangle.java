package abstract1;

public class Rectangle extends Shape {
    Rectangle(double x,double y){
        base=x;
        height=y;
    }
    @Override
    protected void area(){
        System.out.println(base*height);
    }
}
