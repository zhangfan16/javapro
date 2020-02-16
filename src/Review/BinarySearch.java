package Review;

/**
 * Created by zf188 on 2020/2/16.
 */

//二分搜索：
        //在数组中快速查找元素（必须是有序的数组）
public class BinarySearch {
    public static void main(String[] args) {
        int []array = new int[80000];
        for (int i = 0;i<array.length;i++){
            array[i] = i+1;
        }
        int a = 80000;
//        int index = find(array,a);
        int index = search(array,a);
        System.out.println(index);
    }
    //从array中找到value的索引
    public static int find(int[]array,int value){
        int count =0;
//        int index = -1;
        for (int i = 0;i<array.length;i++){
            count++;
            if (array[i] == value){
                System.out.println("查找了"+count+"次");
                return i;
            }
        }

        return -1;
    }

    //二分搜索查询，从array中找value值
    public static int search(int[]array,int value){
        int min = 0;
        int max = array.length-1;
        int mid;
        int count = 0;
        while (min<=max){
            count++;
            mid = (min+max)/2;
            if (value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<array[mid]){
                max = mid-1;
            }else {
                min = mid+1;
            }
        }
        return -1;
    }
}
