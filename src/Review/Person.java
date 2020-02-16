package Review;

/**
 * Created by zf188 on 2020/2/15.
 */
public class Person {
    public int no;
    public char name;
    private int age;

  /*  public void add(int a,int b){
        int c = a +b;
//      System.out.println(age);

    }*/

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age>1000){
//            this.age = 1;
            System.out.println("输入错误");
        }else {
            System.out.println(age);
        }

    }
    public int add(int a,int b){
        int c = a+b;
        return c;
    }
    //参数(个数，类型，个数类型)不一样允许方法名一样
    public int  add(byte a,byte b){
        byte c = (byte) (a +b);

       return c;
    }
    public static int   add(int a,int b,int c){
        int d = a+b+c;

        return d;
    }
    public static int abc = 100;
}

