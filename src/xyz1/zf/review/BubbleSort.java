package xyz1.zf.review;

/**
 * Created by zf188 on 2020/2/22.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {3,3,223,234,234,4,4,32,24,};
        for (int i = 0;i<array.length-1;i++){
            int flag = 0;//计数器；当j不再循环时结束循环；
            for (int j= 0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if (flag == 0){
                break;
            }
        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
