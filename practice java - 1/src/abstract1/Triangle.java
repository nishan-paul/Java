package abstract1;

public class Triangle extends Shape {
    Triangle(double x,double y){
        base=x;
        height=y;
    }
    @Override
    protected void area(){
        System.out.println(0.5*base*height);
    }
}
