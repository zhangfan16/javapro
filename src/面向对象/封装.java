package 面向对象;

/**
 * Created by zf188 on 2020/2/5.
 */
public class 封装 {
    public static void main(String[] args) {
        Person p1= new Person(10,20);
        Dog d1 = new Dog();
        d1.setAge(1);
        System.out.println(d1.getAge());
        System.out.println(p1.getAge());
//        public Person(int age,int no){
//
//        }
        Dog d2 = new Dog();
        d2.run();
    }
}
