import java.util.*;

public class LP4_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 1-20");
    int y = input.nextInt();
    double h = Math.random() * 20;
    int r = Math.floor(h);
    System.out.println("Computer's number: " + r);
    System.out.println("Player's number: " + y);
    if (y == r) {
    System.out.println("You win!");
    } else {
    System.out.println("Better luck next time!");
    }
  }
}
