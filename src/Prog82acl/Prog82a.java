package Prog82acl;
import java.util.*;

public class Prog82a {
  Scanner input = new Scanner(System.in);
  System.out.println("Speed limit: ");
  int limit = input.nextInt();
  System.out.println("Your speed: ");
  int speed = input.nextInt();

  cl82a w = new cl82a(speed, limit);
  w.calc();

  int fine = getFine();

  System.out.println("Fine-------------" + fine);

}
