package com.neuedu.review;

/**
 * Created by zf188 on 2020/2/22.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int []array = {12,2,32,42,122,3123,543,64,22};
        for (int i = 0;i<array.length-1;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp =array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a :array){
            System.out.println(a);
        }
    }
}
