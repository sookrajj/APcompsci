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


      }
    }
  }
}
