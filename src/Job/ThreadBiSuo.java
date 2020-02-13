package Job;

/**
 * Created by zf188 on 2020/2/13.
 */
public class ThreadBiSuo {
    public static int a = 0;
    public static void main(String[] args) {
        Thread t = new Thread(()->{
           for (int i = 0;i<100;i++){
               System.out.println(Thread.currentThread().getName()+"线程输出---"+i);
               try {
                   Thread.sleep(5);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        t.start();
        System.out.println(a);
    }
}
