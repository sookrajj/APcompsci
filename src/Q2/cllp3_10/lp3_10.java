package Q2.cllp3_10;
import java.util.*;
public class lp3_10 {
  public static void main(String[] args) {
    Scanner isuckatshooting = new Scanner(System.in);
    System.out.print("Enter the number of burgers: ");
    int burgs = isuckatshooting.nextInt();
    System.out.print("\nEnter the number of fries: ");
    int fres = isuckatshooting.nextInt();
    System.out.print("\nEnter the number of sodas: ");
    int sods = isuckatshooting.nextInt();
    cllp3_10 getrekt = new cllp3_10(burgs, fres, sods);
    getrekt.calc();
    cllp3_10[] iambored = new cllp3_10[1];
    iambored[0] = getrekt;
    System.out.println("\n" + getrekt.toString());
    double totwtax = getrekt.getTotwtax();
    System.out.print("Enter the amount tendered: ");
    double ten = isuckatshooting.nextInt();
    System.out.print("\nChange: " + (Math.round((ten - totwtax) * 100.0)/100.0));
  }
}
//Enter the number of burgers: 2
//
//Enter the number of fries: 5
//
//Enter the number of sodas: 5
//
//Total before tax: 13.780000000000001
//Tax: 0.9
//Final total14.680000000000001
//Enter the amount tendered: 20
//
//Change: 5.32
//Process finished with exit code 0