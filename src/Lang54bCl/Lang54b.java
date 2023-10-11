package Lang54bCl;
import java.util.*;

public class Lang54b {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 4 numbers in a row");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();

    cl54a w = new cl54a(num1, num2, num3, num4);
    w.calc();

    int sum = w.getSum();
    int mean = w.getMean();

    System.out.println("Sum: " + sum);
    System.out.println("Mean: " + mean);
  }

}
