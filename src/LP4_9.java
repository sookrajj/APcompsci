import java.util.*;

public class LP4_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 1-20");
    int y = input.nextInt();
    double h = Math.random() * 20;
    double r = Math.floor(h);
    System.out.println("Computer's number: " + r);
    System.out.println("Player's number: " + y);
    if (y == r) {
    System.out.println("You win!");
    } else {
    System.out.println("Better luck next time!");
    }
  }
}
// Enter a number between 1-20
//16
//Computer's number: 2.0
//Player's number: 16
//Better luck next time!
