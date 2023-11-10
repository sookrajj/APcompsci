import java.util.*;

public class lp3-9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String hi = "";
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
    cllp3-9 sad = new cllp3-9(by, bm, bd, cy, cm, cd);
    sad.calc();
    h = sad;
    System.out.println("\n" + sad);
  }
}
    
    
    
    
