package models;

public class BooksInfo {
    String bookName;
    int bookQty;

    public BooksInfo(String bookName, int bookQty) {
        this.bookName = bookName;
        this.bookQty = bookQty;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookQty() {
        return bookQty;
    }
}
