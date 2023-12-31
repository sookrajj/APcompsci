package Q2;
import java.util.*;
public class MSOE2016p3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter both radii: first one that is above 0, second one below zero.");
    double r1 = input.nextDouble();
    double r2 = input.nextDouble();
    System.out.println("Now enter the diaphram.");
    double d = input.nextDouble();
    System.out.println("Finally enter the reflective index of lens.");
    double n = input.nextDouble();

    double f = 1/((n-1) * (1/r1 - 1/r2 + ((n-1)*d)/(n*r1*r2)));
    System.out.println("The focal of the lens is: " + f);
  }
}
//Enter both radii: first one that is above 0, second one below zero.
//1.65
//-3.2
//Now enter the diaphram.
//4
//Finally enter the reflective index of lens.
//2.9
//The focal of the lens is: 1.2465502503358166
