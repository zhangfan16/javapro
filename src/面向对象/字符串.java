package 面向对象;

/**
 * Created by zf188 on 2020/2/7.
 */
public class 字符串 {
//    public static  int[] a = {1,2,3,4,5};
    //string底层的char数组是final定义的不可改变
    public static void main(String[] args) {
        final int []a = {2,3,4,};
//         a = new  int []{2,2};
        for(int i:a) {

            System.out.println(i);
        }
       String b = "dsfsd";
       b = "da";
        method(b);
        System.out.println(b);
    }

    private static void method(String b) {
        b = "efa";
    }

}
