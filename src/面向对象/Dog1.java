package 面向对象;

/**
 * Created by zf188 on 2020/2/3.
 */
public class Dog1{
    public int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){

        this.age=age;
    }

    public int add(int a ,int b){
        int c = a+ b;
        return c;
    }
    public int  add(int a ,int b, int c){
        int d = a+b+c;
        return d;
    }
    public static double  add(double a ,double b, int c){
        double d = a+b+c;
        return d;
    }
}
