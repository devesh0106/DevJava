package JavaCore;

import java.util.Comparator;

public class Book  {
    private int bookId;
    private String bname;
    private String Author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }


    Comparator<Book> firstComparator = Comparator.comparing(Book::getBookId);
    Comparator<Book> FirstBookIdThenNamethenAuthor = Comparator.comparing(Book::getBookId).thenComparing(Book::getBname).thenComparing(Book::getAuthor);

}
