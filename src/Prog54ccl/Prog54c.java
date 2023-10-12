package Prog54ccl;
import java.util.*;

public class Prog54c {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter radius: ");
    double radius = input.nextDouble();

    cl54c wow = new cl54c(radius);
    wow = wow.calc();

    radius = wow.getRadius();
    area = wow.getArea();
    circum = wow.getCircumference();
    System.out.println("Radius: " + radius + "\nArea: " + area + "\nCircumference: " + circum;
}
//
