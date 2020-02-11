/**
 * Created by zf188 on 2020/2/6.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 定义一个类Mybook，包括成员name（书名String）、
 * price（价格 double）、
 * press（出版社String）、
 * author（作者 String）、
 * bookISBN（书的ISBN号String），
 定义一个类数组mybook books[200]，
 编写一个函数inputData(ArrayList<Mybook> books])，n为书的数量，从键盘上输入n本书的信息，
 编写一个函数print(ArrayList<Mybook> books)，输出全部书的信息。
 * @author Cardiac
 *
 */
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Mybooks> books = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String name = sc.next().intern();
            double price = sc.nextDouble();
            String press = sc.next().intern();
            String author = sc.next().intern();
            String bookISBN = sc.next().intern();
            boolean add = books.add(new Mybooks(name, price, press, author, bookISBN));
        }
        Mybooks mybooks = new Mybooks();
        mybooks.inputData(books);
        mybooks.print();
    }


}
