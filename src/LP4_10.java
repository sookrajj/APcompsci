import java.util.*;

public class LP4_10{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Rectangular prism");
    System.out.println("The length is: ");
    int o = input.nextInt();
    System.out.println("The width is: ");
    int w = input.nextInt();
    System.out.println("The height is: ");
    int r = input.nextInt();
    int q = o * w * r;
    System.out.println("The volume is: " + q);

    System.out.println("Sphere");
    System.out.println("The radius is: ");
    int u = input.nextInt();
    int a = u * 2;
    double i = (3.14 * Math.pow(a, 3)) / 6;
    System.out.println("The area of the Sphere is: " + i);

    System.out.println("Cube");
    System.out.println("The length of a side is: ");
    int f = input.nextInt();
    double y = Math.pow(f, 3);
    System.out.println("The area of the cube is: " + y);
  }
}
//Rectangular prism
//The length is:
//3
//The width is:
//4
//The height is:
//5
//The volume is: 60
//Sphere
//The radius is:
//3
//The area of the Sphere is: 113.04
//Cube
//The length of a side is:
//4
//The area of the cube is: 64.0
//
//Process finished with exit code 0