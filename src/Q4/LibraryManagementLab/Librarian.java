package Q4.LibraryManagementLab;

import java.util.*

public Librarian {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Library li = new Library();
    LibraryManager lib = new LibraryManager();
    ArrayList<Book> books = new ArrayList<>();
    books = lib.loadCatalog();
    if (books.isEmpty()) {
      System.out.print("Failed to start program");
    } else {
      int num = 10;
      while (num != 8) {
        System.out.println("Menu:/n/n1. Add Patron/n2. Add Book/n3. Remove Book/n4. Checkout Book/n" +
                           "5. Return book/n6. Search Book/n7. Search Book Transaction/n 8. Exit");
        System.out.print("Enter your choice: ");
        num = s.nextInt();

        if (num == 1) {
          System.out.print("/nEnter Name: ");
          String name = s.next();
          System.out.print("/nEnter Patron ID: ");
          String patron = s.next();
          li.addPatron(new Patron(name, patron));
          System.out.println("/nPatron added successfully");
        } else if (num == 2) {
          System.out.print("/nEnter Isbn: ");
          String Isbn = s.next();
          System.out.print("/nEnter Title: ");
          String title = s.nextLine();
          System.out.print("/nEnter Author :");
          String aut = s.nextLine();
          li.addBook(new Book(Isbn, title, aut));
          System.out.println("/nBook added successfully");
        } else if (num == 3) {
          System.out.print("/nEnter ISBN: ");
          String Isbn = s.next();
          li.removeBook(Isbn);
          System.out.print("/nRemoved successfully");
        } else if (num == 4) {
          System.out.print("/nEnter Isbn: ");
          String Isbn = s.next();
          System.out.print("/nEnter Patron ID: ");
          String patron = s.next();
          li.checkOutBook(Isbn, patron, li.getDateToday());
          System.out.println("/nBook checked out successfully");
        } else if (num == 5) {
          System.out.print("/nEnter Isbn: ");
          String Isbn = s.next();
          System.out.print("/nEnter Patron ID: ");
          String patron = s.next();
          li.checkinBook(Isbn, patron, li.getDateToday());
          System.out.println("/nBook checked in successfully");
        } else if (num == 6) {
          System.out.print("/nEnter Title: ");
          String title = s.next();
          li.searchBookByTitle(title);
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

          
