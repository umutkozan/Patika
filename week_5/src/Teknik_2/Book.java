package Teknik_2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    public String toString() {
        return "Book{" +
                "title=' " + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=' " + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //Kitap nesnelerinin oluşturulması
        Book book1 = new Book("The catcher in the Rye ", 277, "J.D. Salinger", "1951");
        Book book2 = new Book("To kill a Mockingbird", 281, "Harper Lee", "1960");
        Book book3 = new Book("1984", 328, "George Orwell", "1949");
        Book book4 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925");
        Book book5 = new Book("ABC",1234,"Manisa","1930");
        Set<Book> booksByTitle = new TreeSet<>();
        booksByTitle.add(book1);
        booksByTitle.add(book2);
        booksByTitle.add(book3);
        booksByTitle.add(book4);
        booksByTitle.add(book5);
        System.out.println("Books sorted by title : ");
        for (Book book : booksByTitle) {
            System.out.println(book);
        }
        Set<Book> booksByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPageCount(), o2.getPageCount());
            }
        });
        booksByPageCount.addAll(booksByTitle);
        System.out.println("\nBooks sorted by page count: ");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}