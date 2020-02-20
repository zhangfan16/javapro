package com.neuedu.test;

/**
 * Created by zf188 on 2020/2/20.
 */
public class MyBubbleSort {
    public static void main(String[] args) {
        int [] a =  {12,23,4,5,3,2,21,67};
        for (int i = 0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){

                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a [j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int b:a){
            System.out.println(b);
        }
    }
}
