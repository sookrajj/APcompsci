package Q4.LibraryManagementLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "Langdat/book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog. ");
        }
        return new ArrayList<>();
    }

    // TODO: Implement main program; make a new Library object, load the catalog,
    // add each book from the catalog to the library, then display the menu
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        books = loadCatalog();
        Library li = new Library();
        for (int lcv = 0; lcv < books.size(); lcv++) {
            li.addBook(books.get(lcv));
        }
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
                    System.out.println("Removed successfully");
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
                    Book b = li.findClosestBook(title);
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
//Loading catalog...success.
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 1
//Enter Name: Joe
//Enter Patron ID: 123
//Patron added successfully
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 4
//Enter Isbn: 0801678765
//Enter Patron ID: 123
//Book checked out successfully
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 6
//Enter Title: Basic Nursing
//Book{title='Basic Nursing: Theory and Practice', isbn='0801678765', author='Patricia A. Potter'}
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 7
//Enter Isbn: 0801678765
//Transaction{isbn='0801678765', patronId='123', checkoutDate='2024-04-11', returnDate='null'}
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 5
//Enter Isbn: 0801678765
//Enter Patron ID: 123
//Book checked in successfully
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 7
//Enter Isbn: 0801678765
//Transaction{isbn='0801678765', patronId='123', checkoutDate='2024-04-11', returnDate='2024-04-11'}
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 2
//Enter Isbn: 1122334455
//Enter Title: Testing User Interfaces 101
//Enter Author: George Oregon
//what
//Book added successfully
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 3
//
//Enter ISBN: 1122334455
//Removed successfully
//Menu:
//1. Add Patron
//2. Add Book
//3. Remove Book
//4. Checkout Book
//5. Return book
//6. Search Book
//7. Search Book Transaction
//8. Exit
//Enter your choice: 8
//Exiting...