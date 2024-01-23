package Q3;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class prog607a {
  public static void main(String[] args) {
    int choice = 1000;
    ArrayList<cl607a> list = new ArrayList<cl607a>();
    Scanner s = new Scanner(System.in);
    String date = "";
    String encode = "";

    while (choice != 0) {
      System.out.println("0) Quit");
      System.out.println("1) Encode date");
      System.out.println("2) Decode date");
      System.out.print("Select an option: ");
      choice = s.nextInt();
      if (choice == 1) {
        System.out.print("\nenter a date (m/d/y): ");
        date = s.next();
        list.add(new cl607a(date));
        list.get(list.size()-1).calc();
        System.out.println("The code is: " + list.get(list.size()-1).getCode());

      } else if (choice == 2) {
        encode = s.next();
        for (int lcv = 0; lcv < list.size(); lcv++) {
          if (list.get(lcv).getCode().equals(encode)) System.out.println("The date is: " + list.get(lcv).getDate());
        }
      }
    }

    System.out.println("Program quitted.");
  }
}
