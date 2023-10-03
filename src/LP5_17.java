import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter password: ");
      String h = input.nextLine().toLowerCase();
      if (h.equals("b-day_boy")) {
        System.out.println("Welcome");
        System.exit(0);
      } else {
        System.out.println("Try again");
      }
       System.out.print("Enter password: ");
      String l = input.nextLine().toLowerCase();
      if (l.equals("b-day_boy")) {
        System.out.println("Welcome");
        System.exit(0);
      } else {
        System.out.println("Try again");
      }
       System.out.print("Last try to enter password: ");
      String p = input.nextLine().toLowerCase();
      if (p.equals("b-day_boy")) {
        System.out.println("Welcome");
      } else {
        System.out.println("Access denied!");
      }
          

    }
}
//Enter password: the
//Try again
//Enter password: b-day_boy
//Welcome