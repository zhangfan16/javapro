package com.neuedu.review;

/**
 * Created by zf188 on 2020/2/22.
 *
 * javase 没有试图画面，控制台打印
 * javaee 融入了网页，前端和结合，更新容易，用户交替
 * Java 编译型语言，
 * js 解释性语言
 */
/*
* 类就是造对象用的
* */
public class Review1 {
    public static void main(String[] args) {
        /*//创建对象：
        Person p1 = new Person();
        //对象引用属性并赋值：
        p1.setAge(6);
//        System.out.println(p1.getAge());
        int a = 1;
        if (a>10){
            System.out.println(10);
        }else {
            System.out.println(a);
        }
        //判断是否是闰年：
        int year = 1992;
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }

        int b = 0;
        while (b<10){
            System.out.println("跑");
            b++;
        }
        for (int i = 0;i<10;i++){
            System.out.println("跑");
        }
        //求和
        int sum = 0 ;
        for (int m = 1;m<=100;m++){
            sum = sum +m;
        //for里面的都要被执行循环
        }
        System.out.println(sum);
        byte n = 3;
        n =(byte) (n+1) ;
        n+=1;
        System.out.println(n);
        int h = 0;
        int g = h++;
        ++h;
        System.out.println(g);
        //计算1~100的指数和：只能被1和自身整除的数
        int sum2 = 0;
        for (int p = 1;p<=100;p++){
            for (int f = 1;f<p;f++){
                if (p%f != 0){
                    System.out.print(p+" ");
                    sum2 = sum2+p;
                }
            }
        }

        System.out.println();
        System.out.println(sum2);*/
        int i,n,k=0;

        for (n = 3; n<=100; n++) {     //3~100的所有数

            i=2;

            while (i<n) {

                if (n%i==0)  break;  //若能整除说明n不是素数，跳出当前循环

                i++;

            }

            if (i==n) {     //如果i==n则说明n不能被2~n-1整除，是素数

                k++;             //统计输出数的个数

                System.out.print(i+ "\t ");

                if (k %6==0)    //每输出5个则换行

                    System.out.println();

            }
        }
        int a = 10;
        method (a);
        System.out.println(a);


        Person f = new Person();
        f.setAge(10);
        method(f);
        System.out.println(f.getAge());
    }
    public static void method(int a){
        a = 100;
    }
    public static void method(Person f){
        f.setAge(100);
    }
}
