package Review;

/**
 * Created by zf188 on 2020/2/17.
 */
public class TriShu {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i<10;i++){
            for (int j = 0;j<10;j++){
                for (int k = 0;k<10;k++){
                 String s = " "+i+j+k;
                    System.out.println(s);
                    count++;

                }
            }
        }
        System.out.println("一共是"+count+"个");
    }
}
