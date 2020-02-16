package Review;

/**
 * Created by zf188 on 2020/2/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {5,1,90,38,47,20,2,100,77,65,50};
        for(int i = 0;i<array.length-1;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i]>array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
