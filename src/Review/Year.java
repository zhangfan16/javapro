package Review;

/**
 * Created by zf188 on 2020/2/16.
 */
public class Year {
    public static void main(String[] args) {
        int year = 100;
        //四年一闰，百年不闰；四百年再闰
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
