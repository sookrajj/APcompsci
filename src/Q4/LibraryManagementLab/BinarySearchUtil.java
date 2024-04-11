package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using
    //  recursion for searching books by title (required) or author
    public static int binser(ArrayList<Book> books, String title) {
        int fir = 0;
        int las = books.size()-1;
        while (fir <= las) {
            int mid = fir + (las-fir)/2;
            if (books.get(mid).getTitle().length() > title.length()) {
                if (books.get(mid).getTitle().substring(0, title.length()).toLowerCase().compareTo(title.toLowerCase()) > 0) {
                    fir = mid + 1;
                } else if (books.get(mid).getTitle().substring(0, title.length()).toLowerCase().compareTo(title.toLowerCase()) < 0) {
                    las = mid - 1;
                } else {
                    return mid;
                }
                System.out.println(fir + " " + las);
            }
        }
        return -1;
    }
    public int autser(ArrayList<Book> books, String author) {
        int fir = 0;
        int las = books.size()-1;
        while (fir <= las) {
            int mid = fir + (las-fir)/2;
            if (books.get(mid).getAuthor().toLowerCase().compareTo(author.toLowerCase()) > 0) {
                fir = mid-1;
            } else if (books.get(mid).getAuthor().toLowerCase().compareTo(author.toLowerCase()) < 0) {
                las = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void sor(ArrayList<Book> books, int num) {
        if (books.get(num).getTitle().compareTo(books.get(num+1).getTitle()) > 0) {
            Book temp = books.get(num);
            books.set(num, books.get(num+1));
            books.set(num+1, temp);
        } else {
            return;
        }
    }
}
