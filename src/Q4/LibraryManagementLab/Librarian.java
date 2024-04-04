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
          String title = s.nextLine();
          System.out.print("Enter Author :");
          String aut = s.nextLine();
          li.addBook(new Book(Isbn, title, aut));
          System.out.println("Book added successfully");
        } else if (num == 3) {
          System.out.print("Enter ISBN: ");
          String Isbn = s.next();
          li.removeBook(Isbn);
          System.out.print("Removed successfully");
        }
          
