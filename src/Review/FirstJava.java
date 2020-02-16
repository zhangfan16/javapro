package Review;

import java.util.Random;

/**
 * Created by zf188 on 2020/2/16.
 */
public class FirstJava {
    private static int status;


    public static void main(String[] args) {
//        conslog.log();
        int c = 5;
        Integer b = 223;
        Integer a = 223;//127之内true
        Integer d = 22;
        Random e = new Random();
        System.out.println(e.nextInt(1000));
        if (a == b) {
            d = a;

        }


        System.out.println(c);
        System.out.print("weojf");
        System.out.println("12321123445667888");
        System.out.println(c << 1);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(d);
    }
         /*
        * java 的数据类型：
        *   基本类；
        *           byte    整数型
        *           short   整数型
        *           int     整数型
        *           long    整数型
        *           double  双精度
        *           float   浮点型
        *           char    字符型
        *           boolean 布尔型
        *
        *           二进制：%2取余数；从下往上；
        * */
//        Teacher wng =new Wang();
 /*       Wang wang = new Wang();
        n(wang);
        Wang wng = new Wang();
        f(wng);


    }

    public static void n(Teacher teacher) {

    }
    public static void f(Teacher teacher){

    }*/

    public static String method(){
        String str = method();
        try{
            System.exit(0);
            int i = 100/0;
            return "abcd";
        }catch (Exception ex){
            return "efg";
        }finally {
            System.out.println(str);
        }
    }
}
