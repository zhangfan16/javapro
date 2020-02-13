package Job;

import java.util.List;

/**
 * Created by zf188 on 2020/2/13.
 */
public class FeiNaBo {
    //1,1,2，3，5，8/每个数等于前两个数之和
//    List<Integer> list = new L
    public static void main(String[] args) {
        System.out.println(method(1));

    }
    public static int method(int n){
        if (n==1||n==2){
            return 1;
        }else {
            int f1 = 1;
            int f2 = 2;
            int sum;
            for (int i = 3;i<= n;i++){
                sum = f1+f2;
                f1 = f2;
                f2 = sum;
            }
            return f2;
        }

    }
}
