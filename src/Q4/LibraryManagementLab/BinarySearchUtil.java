package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using
    //  recursion for searching books by title (required) or author
    public int binser(ArrayList<Book> books, String title) {
        int fir = 0;
        int las = books.size()-1;
        while (fir <= las) {
            int mid = fir + (las-fir)/2;
            if (books.get(mid).getTitle().compareTo(title) > 0) {
                fir = mid-1;
            } else if (books.get(mid).getTitle().compareTo(title) < 0) {
                las = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public int autser(ArrayList<Book> books, String author) {
        int fir = 0;
        int las = books.size()-1;
        while (fir <= las) {
            int mid = fir + (las-fir)/2;
            if (books.get(mid).getAuthor().compareTo(author) > 0) {
                fir = mid-1;
            } else if (books.get(mid).getAuthor().compareTo(author) < 0) {
                las = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
