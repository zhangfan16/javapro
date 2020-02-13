package Job;

import 面向对象.SalariedEmployee;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by zf188 on 2020/2/13.
 */
public class Semahone1 {
    public static int a= 0;
    public static Object obj = new Object();

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        CountDownLatch countDownLatch = new CountDownLatch(5000);
            for(int i = 0;i<5000;i++){
                Thread t = new Thread(()->{
                    try {
                        semaphore.acquire();//阻塞
                        a++;
                        countDownLatch.countDown();
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                t.start();
            }
        }

}
