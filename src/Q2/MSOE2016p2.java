package Q2;
import java.util.*;

public class MSOE2016p2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter side length a:");
    int a = input.nextInt();
    System.out.print("Please enter side length c:");
    int c = input.nextInt();
    System.out.print("Please enter angle a:");
    double ana = input.nextDouble();
    double anc = 0.0;

    anc = Math.asin((Math.sin(ana)/a) * c);

    if (180-anc+ana < 180) {
      System.out.println("The angle of c can be: " + anc + " and " + (180-anc));
    } else System.out.println("The angle of c is " + anc);
    
  }
}
