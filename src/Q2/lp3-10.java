package Q2;
import java.util.*;

public class lp3-10 {
  public static void main(String[] args) {
    Scanner isuckatshooting = new Scanner(System.in);
    System.out.print("Enter the number of burgers: ");
    int burgs = isuckatshooting.nextInt();
    System.out.print("\nEnter the number of fries: ");
    int fres = isuckatshooting.nextInt();
    System.out.print("\nEnter the number of sodas: ");
    int sods = isuckatshooting.nextInt();
    cllp3-10 getrekt = new cllp3-10(burgs, fres, sods);
    String iambored = getrekt;
    System.out.println("\n" + iambored);
    double totwtax = iambored.getTotwtax();
    System.out.print("Enter the amount tendered: ");
    double ten = isuckatshooting.nextInt();
    System.out.print("\nChange: " + (ten - totwtax));
  }
}
