package Review;

/**
 * Created by zf188 on 2020/2/16.
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i= 0 ; i<=100;i++){
//            sum = sum +i;
            sum += i;
        }
        int a = 1;
        int b = ++a;
        System.out.println(sum);
        System.out.println(b);
    }
}
