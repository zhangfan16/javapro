package Review;

/**
 * Created by zf188 on 2020/2/16.
 */
public class ZhiShuSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int m = 2;m <= 100;m++){
            int x= 0;
            for (int n= 2;n < m;n++){
                if (m%n == 0){
                    x++;
                }
            }
            if (x == 0){
                sum += m;
            }
        }
        System.out.println(sum);
    }
}
