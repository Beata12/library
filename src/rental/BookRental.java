package rental;

import java.util.HashMap;

public class BookRental {

    private HashMap<String, Book> books = new HashMap<>();//w hasmapie przechowuje wsyztskie moje ksiazki

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void displayAllBooks() {
        System.out.println("All books: ");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void displayAvailableBooks() {
        System.out.println("All available books: ");
        for (Book book : books.values()) {
            if(!book.isBooked()) {
                System.out.println(book);
            }
        }
    }

    public void booked(String bookId) {
        books.get(bookId).setBooked(true);
    }

    public void returned(String bookId) {
        books.get(bookId).setBooked(false);
    }
}
