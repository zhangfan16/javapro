package 面向对象;

/**
 * Created by zf188 on 2020/2/10.
 */
public class MyTestS {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20,"红色");
        rectangle.shouAll();
        Circle circle = new Circle(10,"红色");
        circle.shouAll();
    }
}
