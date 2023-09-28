import java.util.*;

public class LP4_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input a whole number between 1-4");
    int j = input.nextInt();
    double f = Math.random() * 10;
    double u = Math.floor(f);
    double h = Math.random() * 10;
    double e = Math.floor(h);
    if (j == 1) {
      System.out.println("What is " + u + "*" + e + "?");
      int r = input.nextInt();
      double g = u * e;
      if (g == r) {
        System.out.println("Correct!");
      } else {
        System.out.println("Wrong.");
      }
    } else if (j == 2) {
      System.out.println("What is " + u + "+" + e + "?");
      int r = input.nextInt();
      double g = u + e;
      if (g == r) {
        System.out.println("Correct!");
      } else {
        System.out.println("Wrong.");
      }
    } else if (j == 3) {
      System.out.println("What is " + u + "-" + e + "?");
      int r = input.nextInt();
      double g = u - e;
      if (g == r) {
        System.out.println("Correct!");
      } else {
        System.out.println("Wrong.");
      }
    } else {
      System.out.println("What is " + u + "/" + e + "?");
      int r = input.nextInt();
      double g = u / e;
      if (g == r) {
        System.out.println("Correct!");
      } else {
        System.out.println("Wrong.");
      }
    }
  }
}
//Input a whole number between 1-4
//4
//What is 0.0/7.0?
//0
//Correct!