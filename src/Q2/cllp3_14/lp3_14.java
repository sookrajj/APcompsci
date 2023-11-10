package Q2.cllp3_14;
import java.util.*;
public class lp3_14 {
  public static void main(String[] args) {
    Scanner turkeygogobblegobble = new Scanner(System.in);
    System.out.println("Enter results for New York: ");
    System.out.print("Aubrey: ");
    int any = turkeygogobblegobble.nextInt();
    System.out.print("Martinez: ");
    int mny = turkeygogobblegobble.nextInt();
    System.out.println("Enter results for New Jersey: ");
    System.out.print("Aubrey: ");
    int anj = turkeygogobblegobble.nextInt();
    System.out.print("Martinez: ");
    int mnj = turkeygogobblegobble.nextInt();
    System.out.println("Enter results for Connecticut: ");
    System.out.print("Aubrey: ");
    int ac = turkeygogobblegobble.nextInt();
    System.out.print("Martinez: ");
    int mc = turkeygogobblegobble.nextInt();
    cllp3_14 turkeydied = new cllp3_14(any, mny, anj, mnj, ac, mc);
    turkeydied.calc();
    cllp3_14[] turkeysmydinnernow = new cllp3_14[1];
    turkeysmydinnernow[0] = turkeydied;
    System.out.print("\n" + turkeysmydinnernow[0]);
  }
}
//Enter results for New York:
//Aubrey: 314159
//Martinez: 271860
//Enter results for New Jersey:
//Aubrey: 89008
//Martinez: 121032
//Enter results for Connecticut:
//Aubrey: 213451
//Martinez: 231034
//
//Canidates		 Votes Percentage
//Awbrey  		616618.0	49.71 %
//Martinez		623926	50.29 %
//TOTAL VOTES:	 1240544.0
//Process finished with exit code 0