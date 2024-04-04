package Q4.LibraryManagementLab;

import java.util.*;

public class Librarian {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    LibraryManager lib = new LibraryManager();
    ArrayList<Book> books = new ArrayList<>();
    books = lib.loadCatalog();
    Library li = new Library(books);
    if (books.isEmpty()) {
      System.out.print("Failed to start program");
    } else {
      int num = 10;
      while (num != 8) {
        System.out.println("Menu:\n1. Add Patron\n2. Add Book\n3. Remove Book\n4. Checkout Book\n" +
                           "5. Return book\n6. Search Book\n7. Search Book Transaction\n8. Exit");
        System.out.print("Enter your choice: ");
        num = s.nextInt();

        if (num == 1) {
          System.out.print("Enter Name: ");
          String name = s.next();
          System.out.print("Enter Patron ID: ");
          String patron = s.next();
          li.addPatron(new Patron(name, patron));
          System.out.println("Patron added successfully");
        } else if (num == 2) {
          System.out.print("Enter Isbn: ");
          String Isbn = s.next();
          System.out.print("Enter Title: ");
          String ti = s.next();
          String title = ti + s.nextLine();
          System.out.print("Enter Author: ");
          String a = s.next();
          String aut = a + s.nextLine();
          System.out.println("what");
          li.addBook(new Book(Isbn, title, aut));
          System.out.println("Book added successfully");
        } else if (num == 3) {
          System.out.print("\nEnter ISBN: ");
          String Isbn = s.next();
          li.removeBook(Isbn);
          System.out.print("Removed successfully");
        } else if (num == 4) {
          System.out.print("Enter Isbn: ");
          String Isbn = s.next();
          System.out.print("Enter Patron ID: ");
          String patron = s.next();
          li.checkoutBook(Isbn, patron);
          System.out.println("Book checked out successfully");
        } else if (num == 5) {
          System.out.print("Enter Isbn: ");
          String Isbn = s.next();
          System.out.print("Enter Patron ID: ");
          String patron = s.next();
          li.checkinBook(Isbn, patron);
          System.out.println("Book checked in successfully");
        } else if (num == 6) {
          System.out.print("Enter Title: ");
          String ti = s.next();
          String title = ti + s.nextLine();
          Book b = li.searchBookByTitle(title);
          System.out.println(b.toString());
        } else if (num == 7) {
          System.out.print("Enter Isbn: ");
          String Isbn = s.next();
          li.viewMostRecentTransaction(Isbn);
        } else if (num != 8) {
          System.out.println("Number cannot be used.");
        }
          
      }
    }
    System.out.println("Exiting...");
  }
}

          
