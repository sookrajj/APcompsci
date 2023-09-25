import java.util.*;

public class StringInt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();

        for (int lcv = 0; lcv < str.length(); lcv++) {
            String c = str.substring(lcv, lcv+1);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("first non-repeating character is: " + c);
                break;
            }
        }

    }
}
//morning
//first non-repeating character is: m