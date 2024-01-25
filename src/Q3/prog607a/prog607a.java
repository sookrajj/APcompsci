package Q3.prog607a;

import java.util.ArrayList;
import java.util.Scanner;

public class prog607a {
  public static void main(String[] args) {
    int choice = 1000;
    ArrayList<cl607a> list = new ArrayList<cl607a>();
    Scanner s = new Scanner(System.in);
    String date = "";
    int month = 0;
    String encode = "";

    while (choice != 0) {
      System.out.println("0) Quit");
      System.out.println("1) Encode date");
      System.out.println("2) Decode date");
      System.out.print("Select an option: ");
      choice = s.nextInt();
      if (choice == 1) {
        System.out.print("\nenter Month: ");
        month = s.nextInt();
        System.out.print("\nenter Day: ");
        int day = s.nextInt();
        System.out.print("\nenter Year: ");
        int year = s.nextInt();
        list.add(new cl607a(month, day, year));
        list.get(list.size()-1).calc();
        System.out.println("\nThe code is: " + list.get(list.size()-1).getCode());

      } else if (choice == 2) {
        System.out.print("Enter the code in all caps: ");
        encode = s.next();
        encode.toUpperCase();
        for (int lcv = 0; lcv < list.size(); lcv++) {
          if (list.get(lcv).getCode().equals(encode)) System.out.println("The date is: " + list.get(lcv).toString());
        }
      }
    }

    System.out.println("Program quitted.");
  }
}
//0) Quit
//1) Encode date
//2) Decode date
//Select an option: 1
//
//enter Month: 1
//
//enter Day: 13
//
//enter Year: 1983
//
//The code is: AQSPX
//0) Quit
//1) Encode date
//2) Decode date
//Select an option: 2
//aqSpX
//0) Quit
//1) Encode date
//2) Decode date
//Select an option: 2
//AQSPX
//The date is: 1/13/1983
//0) Quit
//1) Encode date
//2) Decode date
//Select an option: 0
//Program quitted.