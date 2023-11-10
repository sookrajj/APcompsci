package Q2.cllp3_9;
import java.util.*;
public class lp3_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your birth date");
    System.out.println("Year ");
    int by = input.nextInt();
    System.out.print("\nMonth ");
    int bm = input.nextInt();
    System.out.println("\nDays ");
    int bd = input.nextInt();
    System.out.print("\nEnter today's date");
    System.out.print("\nYears ");
    int cy = input.nextInt();
    System.out.print("\nMonths ");
    int cm = input.nextInt();
    System.out.print("\nDays ");
    int cd = input.nextInt();
    cllp3_9 sad = new cllp3_9(by, bm, bd, cy, cm, cd);
    sad.calc();
    cllp3_9[] hi = new cllp3_9[1];
    hi[0] = sad;
    System.out.println("\n" + hi[0]);
  }
}
//Enter your birth date
//Year
//2008
//
//Month 10
//
//Days
//6
//
//Enter today's date
//Years 2023
//
//Months 11
//
//Days 10
//
//You have been alive for 5509days
//You have slept 22032hours
//
//Process finished with exit code 0
    
    
    
