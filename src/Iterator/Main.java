package Iterator;

public class Main {
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf(14);
        bookSelf.appendBook(new Book("Around the World in 80 Days"));
        bookSelf.appendBook(new Book("Bible"));
        bookSelf.appendBook(new Book("Cinderella"));
        bookSelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookSelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
