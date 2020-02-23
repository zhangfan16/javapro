package xyz2.zf.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zf188 on 2020/2/23.
 */

public class MyBookMain {
    public static List<MyBook> list = new ArrayList<>();
    public static void main(String[] args) {
        inputData(list);
        men();

      /*  print(list);
        searchName(list,"书名9");
        deleteName(list,"书名8");
        print(list);
        addBook(list);
        print(list);*/
    }

    public static void men(){
        System.out.println("请输入菜单选择号进行操作：");
        System.out.println("1.添加图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书");
        System.out.println("4.查看所有");
        System.out.println("5.退出");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的图书");
                String name = scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入要查询的图书");
                String  nameS = scanner.next();
                searchName(list,nameS);
                break;
            case 4:
                print(list);
                break;
            case 5:
                System.exit(1);
                break;

        }

    }

    public static void inputData(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
            MyBook myBook = new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"出版社"+i);
         books.add(myBook);
        }
    }
    public static void print(List<MyBook>books){
        for (int i = 0;i<books.size();i++){
            System.out.println(books.get(i));
            men();
        }
    }
    public static void searchName(List<MyBook> books, String name){
        for (int i = 0;i<books.size();i++){
            MyBook myBook = books.get(i);
            if (myBook.getName().equals(name)){
                System.out.println(myBook);
                men();
                return;
            }
        }
        System.out.println("此书不存在");
        men();
    }
    public static void deleteName(List<MyBook> books, String name){
        for (int i = 0;i<books.size();i++){
            MyBook myBook = books.get(i);
            if (myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                men();
                return;
            }
        }
        System.out.println("此书不存在，删除失败");
        men();
    }

    public static void addBook(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String  name = scanner.next();
        System.out.println("请输入价格");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社：");
        String press = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入书的ISBN：");
        String bookISBN = scanner.next();
        MyBook myBook = new MyBook(name,price,press,author,bookISBN);
        //放进几何里
        books.add(myBook);
        men();
    }
}
