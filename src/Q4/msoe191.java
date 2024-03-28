package Q4;

import java.util.*;

public class msoe191 {

    public static int find(String hi, String text) {
        if (hi.length() > text.length()) return 0;
        if (text.substring(0,2).equals(hi)) {
            return 1 + find(hi, text.substring(1));
        }
        return find(hi, text.substring(1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two letters");
        String two = s.next();
        System.out.println("Enter line of text");
        String line = s.next();
        String text = line + s.nextLine();
        int count = find(two, text);
        String rev = two.substring(1) + two.substring(0, 1);
        count += find(rev, text);
        System.out.println("The amount of " + two + " forwards and backwards in your text was " + count);
    }
}
//Enter two letters
//ei
//Enter line of text
//ei ei oei
//The amount of ei forwards and backwards in your text was 3