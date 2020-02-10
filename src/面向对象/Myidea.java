package 面向对象;

/**
 * Created by zf188 on 2020/2/3.
 */
public class Myidea {
    public static void main(String[] args) {
//        int year = 1900;
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("shi");
//        } else {
//            System.out.println("bushi");
//        }
        // while ()语句
        /*int a = 1 ;
    while(a<=10){
        System.out.println("跑");
        a++;
    }*/
        //1-100之内求和
       /* int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;//sum = sum + i
        }
        System.out.println(sum);*/
       //输入数字判断是否素数
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个素数");
        int n = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++){
            if(n%i == 0){
                flag = false;
                break;
            }

        }
        if(flag){
            System.out.println("sushu");
        }else {
            System.out.println("bushishushu");
        }*/
        //1-100之内质数求和
/*
                System.out.print(sum);
            }
        }*/
/*Dog d1 = new Dog();
double c = d1.add(1.2,2.3,3);
        System.out.println(c);*/
        /*double c = Dog.add(1.2,2.1,3);
        System.out.println(c);
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.setAge(10);
        d2.setAge(20);
        System.out.println(d1.age);
        System.out.println(d2.age);*/
/*        int[]array={1,2,3,4};
        for (int a :array){
            System.out.println(a);
        }*/
       /* int i,j,k,sum=0;
        for( i=1;i<=4;i++){
            for( j=1;j<=4;j++){
                if(j==i){
                    continue;
                }
                for( k=1;k<=4;k++){
                    if(k==i||k==j){
                        continue;
                    }
                    int a=100*i+10*j+k;
                    System.out.print(a+" ");
                    sum = sum+1;
                }
            }
        }
        System.out.println("");
        System.out.print("一共有"+sum+"种");*/
        int a = 1;

    }
    public static int method(int a, int b ){
        int c = a++;
        return c;
    }
    public static  void method(Dog a ) {
        a.setAge(100);
    }

}

