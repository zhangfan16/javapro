package Review;

/**
 * Created by zf188 on 2020/2/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5,1,90,38,47,20,2,100,77,65,50};
        for (int i = 0;i<array.length-1;i++){
            int flag = 0;
            for (int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
