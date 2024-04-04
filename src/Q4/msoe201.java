package Q4;

import java.util.*;

public class msoe201 {

    public static String end(String let, String text) {
        if (text.length() == 0) return "";
        int en = text.indexOf(" ");
        if (text.substring(en-1, en).equals(let)) {
            return text.substring(0, en);
        }
        return end(let, text.substring(en+1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a letter");
        String lette = s.next();
        System.out.println("Enter a phrase");
        String p = s.next();
        String phar = p + s.nextLine();

        if (end(lette, phar).equals("")) {
            System.out.println("not found");
        } else {
            System.out.println(end(lette, phar));
        }
    }
}
//Enter a letter
//g
//Enter a phrase
//coffee is a way of stealing time that shoulg by rights belong to your older self
//stealing