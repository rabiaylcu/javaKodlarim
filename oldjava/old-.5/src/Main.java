import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("a", 10);
        Book b2 = new Book("b", 15);
        Book b3 = new Book("c", 20);
        Book b4 = new Book("d", 25);

        List<Book> books = new LinkedList<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Collections.sort(books);

        Iterator iter = books.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }




    }
}