package 分支语句;

/**
 * Created by zf188 on 2020/2/4.
 */
public class 水仙花数 {
    public static void main(String[] args) {
        for (int i = 100;i<=999;i++){
            //取百位
            int a = i/100;
            //取十位i/10%10
            int b= i%100/10;
            //取个位
            int c = i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
