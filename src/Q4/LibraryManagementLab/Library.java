package Q4.LibraryManagementLab;

import java.sql.SQLOutput;
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

    public Library(ArrayList<Book> book) {
        books = book;
        patrons = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void sort() {
        int cnt = 0;
        while (cnt < books.size()-2) {
            for (int lcv = cnt; lcv < books.size()-1; lcv++) {
                BinarySearchUtil.sor(books, lcv);
            }
            cnt++;
        }
    }
    // Implement interface methods
    @Override
    public void addBook(Book book) { /* Implementation; remember to add in sorted order */
        for (int l = 0; l < books.size(); l++) {
            if (book.getTitle().toLowerCase().compareTo(books.get(l).getTitle().toLowerCase()) < 0 && book.getTitle().toLowerCase().compareTo(books.get(l).getTitle().toLowerCase()) > -3) {
                books.add(l, book);
                return;
            }
        }
        books.add(book);
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
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    @Override
    public void removePatron(String patronId) {
        for (int lcv = 0; lcv < patrons.size(); lcv++) {
            if (patrons.get(lcv).getPatronId().equals(patronId)) {
                patrons.remove(lcv);
                return;
            }
        }
    }

    @Override
    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        transactions.add(new Transaction(isbn, patronId, checkoutDate));
    }
    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {
        for (int lcv = 0; lcv < transactions.size(); lcv++) {
            if (transactions.get(lcv).getIsbn().equals(isbn)) {
                if (transactions.get(lcv).getPatronId().equals(patronId)) {
                    transactions.get(lcv).setReturn(returnDate);
                    return;
                }
            }
        }
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        for (int lcv = 0; lcv < books.size(); lcv++) {
            if (books.get(lcv).getIsbn().equals(isbn)) {
                if (!books.get(lcv).getcheck()) {
                    books.get(lcv).setCheckedOut(true);
                    transactions.add(new Transaction(isbn, patronId, this.getDateToday()));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkinBook(String isbn, String patronId) {
        for (int lcv = 0; lcv < books.size(); lcv++) {
            if (books.get(lcv).getIsbn().equals(isbn)) {
                if (books.get(lcv).getcheck()) {
                    books.get(lcv).setCheckedOut(false);
                    transactions.get(lcv).setReturn(this.getDateToday());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
        for (int lcv = books.size()-1; lcv > 0; lcv--) {
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
        int ind = 1110;
        for (int lcv = 0; lcv < books.size(); lcv++) {
            if (Math.abs(books.get(lcv).getTitle().compareTo(title)) < ind) {
                ind = Math.abs(books.get(lcv).getTitle().compareTo(title));
            } else if (Math.abs(books.get(lcv).getTitle().compareTo(title)) == ind) {
                return books.get(lcv);
            }
        }
        return books.get(ind);
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        int spa = (BinarySearchUtil.binser(books, title));
        if (spa == -1) {
            return books.get(0);
        }
        return books.get(spa);
    }

    @Override
    public Book searchBookByAuthor(String author) {
        // TODO: Binary search for book; if not found, return the closest book
        BinarySearchUtil bin = new BinarySearchUtil();
        int hi = bin.autser(books, author);
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

    public ArrayList<Book> getBooks() {return books;}
}
