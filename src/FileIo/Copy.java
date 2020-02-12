package FileIo;

import java.io.*;

import static java.lang.System.out;

/**
 * Created by zf188 on 2020/2/12.
 */
public class Copy {
    public static void main(String[] args) {
//        File file = new File("d:w.java");
        File from = new File("e:w.java");
        File parent = new File("e:/a");
        if(!parent.exists()){
            parent.mkdir();
        }
        File to = new File("e:/a/"+from.getName());
        //从文件from里读取到内存里，再写出到to中
        byte[] b = new byte[1024];
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len!= -1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
            if (outputStream!= null)

                    outputStream.close();

            if (inputStream!= null)
                inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
