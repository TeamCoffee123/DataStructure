package Iterator;

public class BookSelfIterator implements Iterator {
    private BookSelf bookSelf;
    private int index;

    public BookSelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookSelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Book book = bookSelf.getBookAt(index);
        index++;
        return book;
    }
}
