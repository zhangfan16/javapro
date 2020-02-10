package 分支语句;

/**
 * Created by zf188 on 2020/2/4.
 */
public class 偶数和 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("1-100的偶数之和是：" + sum);
    }
}
