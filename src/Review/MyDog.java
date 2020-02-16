package Review;

/**
 * Created by zf188 on 2020/2/16.
 */
public class MyDog {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        this.age = age;
        if (age <1||age>100){
            System.out.println("输入错误");
        }else{
            System.out.println(age);
        }
    }

//        public  static void setage(){}
}
