package xyz1.zf.review;

/**
 * Created by zf188 on 2020/2/22.
 *类创建对象
 * 属性和方法
 */
//建立类名；类中能有的：属性方法
public class Person {
    public int age;
    public int no;
    public char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
//        if (age>0&&age<130){
//            this.age = age;
//            System.out.println(getAge());
//        }else {
//            System.out.println("请输入正确值");
//        }
        this.age = age;

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
