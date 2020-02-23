package xyz2.zf.review;

/**
 * Created by zf188 on 2020/2/22.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int []array = {12,2,32,42,122,3123,543,64,22};
        for (int i = 0;i<array.length-1;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a :array){
            System.out.println(a);
        }


        //binary search
        int [] array1= new int [10000];
        for (int i = 0 ;i<array1.length;i++){
            array1[i] = i+1;
            //System.out.println(i+" "+array1[i]);//i 是数组的下标，array[i]是数组下标的值；
        }
        int a = 3000;
        int index = find(array1,a);
        System.out.println(index);
    }
    public static int find(int[] array1,int value){
        int count = 0;
        for (int i = 0;i<array1.length;i++){
            count++;
            if (array1[i]== value){
            System.out.println("查找了"+count+"次");
            return i;
            }
        }

        return -1;
    }
}
