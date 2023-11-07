import java.util.*;

public class MSOE2016p1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a lowercase word");
    String pali = input.nextString();
    pali = pali.toLowerCase();
    String y = "";
    for (int lcv = pali.length(); lcv > -1; lcv = lcv-1) {
      y += pali.substring(lcv-1, lcv);
    }
    if (pali.equals(y)) System.out.println("Your word is a palindrome.");
    else System.out.println("Your word is not a palindrome.");
