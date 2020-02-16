package FileIo;



import java.io.*;

/**
 * Created by zf188 on 2020/2/12.
 */
public class Practice1 {
    public static void main(String[] args) {
        /*int a = 10 ;
        Student student = new Student();
        student.setId(10);
        student.setName("掌声");
        student.setAge(18);
        student.setGrade("一班");*/
    /*字节流：
    *   构成文件的最小单位字节;
    *   一个中文站两个字节，传<2个，则乱码
    *   视频，图片，文件
    * 字符流：
    *   文本信息用字符流；
    *   话，
    *   文字（通常），其他内容（字节流）
    *区别：
    *   字节单位：byte;字符：2byte的unique
    *File 文件
    *   只进行信息描述和创建删除文件夹mk/文件，不读写
    *流
    *   必须关闭
    *   追加内容
    *   字节/字符输入/输出流
    * */
    //字节流写出
//        File file = new File("e:/w.java");
   /*     try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.isDirectory());
//        System.out.println(file.delete());
        try {
            OutputStream outputStream = new FileOutputStream(file ,true);
            String a = "\n/n111111";
            outputStream.write(a.getBytes());//放东西给管道
            outputStream.flush();//放东西给文件
            outputStream.close();//关闭管道
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
*/
   //字节流读取
        /*InputStream inputStream =null;
        try {
            inputStream = new FileInputStream(file);
            byte[]a = new byte[5];
            int b = inputStream.read(a);
//            System.out.println(inputStream.read(a));

//            System.out.println(b);
            while (b!=-1){

                System.out.println(new String(a,0,b));

//            inputStream.close();
                b = inputStream.read(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        //字符流读取
/*        char []a = new char[10];
        Reader reader = null;
        BufferedReader br = null;
        try {
           reader = new FileReader(file);
           br = new BufferedReader(reader);
           String str = br.readLine();
//                int b = reader.read(a);
            while (str!= null){
//                System.out.println("读取字符数："+b);
//                System.out.println(new String(a,0,b));
//                b = reader.read(a);
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                        e.printStackTrace();
            }
        }*/
//字符流写出
/*        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("111111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer!=null) {
                    writer.close();
                }
                } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
//java对象保存到硬盘中
// 该Java对象是可序列化对象，传输只能传字节流和字符流
        //序列化将java对象转化为字节流/字符流
        //反序列化 字节/字符流转为Java对象
//Outputstream  objectoutputstream
        Student student = new Student();
        student.setId(10);
        student.setName("掌声");
        student.setAge(18);
        student.setGrade("一班");
        File file = new File("e:/student");
        OutputStream outputStream =null;
        ObjectOutputStream objectOutputStream = null;


        try {
           outputStream = new FileOutputStream(file);
           objectOutputStream = new ObjectOutputStream(outputStream) ;
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            outputStream.flush();
            System.out.println("保存完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (objectOutputStream!= null)
                        objectOutputStream.close();
                if (outputStream!= null)
                        outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
