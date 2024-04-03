package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
        transactions = new ArrayList<>();
    }
    // Implement interface methods
    @Override
    public void addBook(Book book) { /* Implementation; remember to add in sorted order */
        BinarySearchUtil bin = new BinarySearchUtil();
        if (bin.binser(books, book.getTitle()) == -1) {
            return;
        } else {
            books.add(bin.binser(books, book.getTitle()), book);
        }
    }
    @Override
    public void removeBook(String isbn) { /* Implementation */
        for (int lcv = 0; lcv < books.size(); lcv++) {
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.remove(lcv);
                return;
            }
        }
    }
    // Other methods...

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
        for (int lcv = books.size(); lcv > 0; lcv--) {
            if (books.get(lcv).getIsbn().equals(isbn)) {
                System.out.println("Most recent transaction is " + books.get(lcv).getTitle());
                return;
            }
        }
        System.out.println("No transactions found for ISBN: " + isbn);
    }

    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        title.toLowerCase();
        return books.get(0);
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        BinarySearchUtil bin = new BinarySearchUtil();
        int hi = bin.binser(books, title);
        if (hi != -1) {
            return books.get(hi);
        } else {
            return null;
        }
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
