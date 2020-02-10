package TestArray;

/**
 * Created by zf188 on 2020/2/6.
 */
public class MyArray {
    private int size;
    private int[] array;
    public MyArray(){
        size = 0;
        array = new int[10];
    }
    public void add(int i){
        if (size>=array.length){
            Object[] newarray = new Object[size+size/2];
            for(int j= 0;j<array.length;j++){
                newarray[j]= array[j];
            }

            System.out.println("扩容完成，新数组长度为"+array.length);
        }
        array[size++] = i;

    }
    //通过下标取值
    public int get(int i){
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }

}
