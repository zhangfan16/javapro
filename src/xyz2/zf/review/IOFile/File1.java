package xyz2.zf.review.IOFile;

import java.io.*;

/**
 * Created by zf188 on 2020/2/23.
 */
public class File1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10);
        student.setName("张三");
        student.setAge(2);
        student.setGrade("yiban");
        File file = new File("e:/a/f.txt");
/*        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.mkdir());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.delete());*/
        try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "1sda1";
            try {
                outputStream.write(a.getBytes());
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            InputStream inputStream = new FileInputStream(file);
            byte [] a = new byte[200];
            try {
                System.out.println(inputStream.read(a));
                inputStream.close();
                System.out.println(new String (a));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
