package Prog82acl;
import java.util.*;

public class Prog82a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Speed limit: ");
    int limit = input.nextInt();
    System.out.println("Your speed: ");
    int speed = input.nextInt();

    cl82a w = new cl82a(speed, limit);
    w.calc();

    int fine = w.getFine();

    System.out.println("Fine-------------" + fine);
  }

}
//Speed limit:
//40
//Your speed:
//55
//Fine-------------95