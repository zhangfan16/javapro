package 分支语句;

/**
 * Created by zf188 on 2020/2/4.
 */
public class m的n次方 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("m:");
            int m = scanner.nextInt();
            System.out.print("n:");
            int n = scanner.nextInt();
            System.out.print("m^n:");
            int a = (int) Math.pow(m, n);
            System.out.println(a);

        }*/
        int m = 5;
        int n = 8;
        int s = 1;
        for (int i= 0;i<n;i++){
            s=s*m;
        }
        System.out.println(s);

    }
}
