import java.util.*;

public class MSOE20141 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt = 0;

        for (int lcv = 0; lcv < word.length() - 1; lcv++) {
            String cletter = word.substring(lcv, lcv+1);
            String nletter = word.substring(lcv+1, lcv+2);
            if (cletter .equals(nletter))
                dblcnt++;

        }
        System.out.printf("%s contains %d double letters \n", word, dblcnt);

    }
}
