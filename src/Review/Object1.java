package Review;

/**
 * Created by zf188 on 2020/2/15.
 */
public class Object1 {
    public static void main(String[] args) {
        Person.add(1,1,1);
        Person p1 = new Person();
//        p1.age = 1;
        p1.setAge(100);
//        System.out.println(p1.getAge());
        p1.add(1,1);
//        p1.add(1,1,1);
        System.out.println(p1.add(1,1));
        //静态方法不用创建p1；直接调用Person中的方法；
        //静态方法中不能调用其他非静态的属性和方法；
        int c =Person.add(1,1,1);
        System.out.println(c);
        Person.abc = 10;
        System.out.println(Person.abc);
    }

//    private static void add(int i, int i1, int i2) {
//    }
}
