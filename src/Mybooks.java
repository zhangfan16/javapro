/**
 * Created by zf188 on 2020/2/11.
 */

import java.util.ArrayList;

public class Mybooks {
    private Mybooks[] mybook;

    public Mybooks(String name, double price, String press, String author, String bookISBN) {
    }

    public Mybooks() {

    }

    public void inputData(ArrayList<Mybooks> books){
        mybook = books.toArray(new Mybooks[0]);
    }

    public void print() {

    }
}
