package 分支语句;

import java.util.Scanner;

/**
 * Created by zf188 on 2020/2/4.
 */
public class 公约数公倍数 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            int b = scanner.nextInt();
            System.out.println("a:"+a);
            System.out.println("b:"+b);

            System.out.println("最大公约数 ： " + getMaxCommonFactory(a, b));
            System.out.println("最小公倍数 ： " + getMaxCommonMultiple(a, b));

        }
    }
    public static int getMaxCommonFactory(int a , int b){
        int res = 1;

        if(a > b) {
            for (int i = a; i > 0; i--) {
                if ((a % i) == 0 && (b % i) == 0) {
                    res = i;
                    break;
                }
            }
        }else{
            for (int i = b; i > 0; i--) {
                if ((a % i) == 0 && (b % i) == 0) {
                    res = i;
                    break;
                }
            }
        }

        return res;
    }
    public static int getMaxCommonMultiple(int a, int b){
        int maxCommonFactory = getMaxCommonFactory(a, b);

        int maxCommonMult = (a * b) / maxCommonFactory;

        return maxCommonMult;
    }


}
