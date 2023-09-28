import java.util.*;

public class LP4_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of eggs purchased");
    int j = input.nextInt();
    int k = j / 12;
    int u = j % 12;
    if (k < 4) {
      double h = k * 0.50 + u * ( 0.50 / 12);
      System.out.println("The bill is equal to: $" + h);
    } else if (k < 6) {
      double h = k * 0.45 + u * ( 0.45 / 12);
      System.out.println("The bill is equal to: $" + h);
    } else if (k < 11) {
      double h = k * 0.40 + u * ( 0.40 / 12);
      System.out.println("The bill is equal to: $" + h);
    } else (k > 11) {
      double h = k * 0.35 + u * ( 0.35 / 12);
      System.out.println("The bill is equal to: $" + h);
    }
  }
}
