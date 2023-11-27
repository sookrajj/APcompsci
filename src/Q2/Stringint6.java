package Q2;
import java.util.*;

public class Stringint6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = input.nextLine().toUpperCase();
        String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] cnt = new int[26];
        for (int lcv = 0; lcv < word.length(); lcv++) {
            for (int lcv2 = 0; lcv2 < ab.length(); lcv2++) {
                if (ab.substring(lcv2, lcv2+1 ).equals(word.substring(lcv, lcv+1))) {
                    cnt[lcv2]++;
                }
            }
        }
        int unique = 0;
        for (int tem : cnt) {
            if (tem > 0) unique++;
        }
        System.out.println("Unique letters " + unique);
    }
}
//Enter a String: java
//Unique letters 3