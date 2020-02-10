package 面向对象;

/**
 * Created by zf188 on 2020/2/5.
 */
public class Person {
    public void move(){
        System.out.println("动物可以移动");
    }
    public Person(){

    }
    public Person(int age,int no){
        this.age = age;
        this.no = no;
    }
    public int getAge(){
        return age;
    }
    public  int getNo(){
        return no;
    }
    private  int age;
    private  int no;

}
