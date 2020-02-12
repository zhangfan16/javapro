package FileIo;

import java.io.File;
import java.io.IOException;

/**
 * Created by zf188 on 2020/2/12.
 */
public class IoFile {
    public static void main(String[] args) {
        File file  = new File("E:\\b.java");
        System.out.println(file.getPath());
//        System.out.println(file.mkdirs());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.length());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(file.delete());
    }
}
