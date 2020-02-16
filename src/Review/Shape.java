package Review;

/**
 * Created by zf188 on 2020/2/10.
 */
public abstract class Shape {
    private double area;
    public double per;
    public String color;
    public Shape(){}
    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void shouAll();
}
