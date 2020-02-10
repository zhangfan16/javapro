package 分支语句;

/**
 * Created by zf188 on 2020/2/4.
 */
public class 选数组合 {
    public static void main(String[] args) {
        int i,j,k,sum=0;
        //拿百位的数给i
        for( i=1;i<=4;i++){
            //拿十位的数给
            for( j=1;j<=4;j++){
                if(j==i){
                    continue;
                }
                //拿个位的数给i
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
        System.out.print("一共有"+sum+"种");
    }
}
