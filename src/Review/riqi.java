package Review;

import java.util.Scanner;

/**
 * Created by zf188 on 2020/2/16.
 */
public class riqi{
    public static void main(String[] args) {
        System.out.println("请输入一个日期（格式如：月日***年）");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int ri= str.indexOf('日');////获取日的下标
        String str1= str.substring(ri+1);////截取年份
        String str2= str.substring(0, ri+1);//截取月份
        System.out.println(str1+str2);
    }

}
