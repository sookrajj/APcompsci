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

    anc = Math.toDegrees(Math.asin(Math.sin(Math.toRadians(ana)/a) * c));

    if (180-anc+ana < 180) {
      System.out.println("The angle of c can be: " + anc + " and " + (180-anc));
    } else System.out.println("The angle of c is " + anc);
    
  }
}
//Please enter side length a:5
//Please enter side length c:7
//Please enter angle a:30
//The angle of c can be: 47.02903736850241 and 132.9709626314976