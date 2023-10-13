package Prog54ccl;
import java.util.*;

public class Prog54c {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter radius: ");
    double radius = input.nextDouble();

    cl54c wow = new cl54c(radius);
    wow.calc();

    radius = wow.getRadius();
    double area = wow.getArea();
    double circum = wow.getCircumference();
    System.out.println("Radius: " + radius + "\nArea: " + area + "\nCircumference: " + circum);
  }
}
//Enter radius:
//3.712
//Radius: 3.712
//Area: 43.28779268096
//Circumference: 23.32316416
