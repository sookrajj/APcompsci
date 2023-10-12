package Prog88acl;
import java.util.*;

public class Prog88a {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number between 1-13: ");
  int num1 = input.nextInt();
  System.out.println("Enter a second number between 2-20: ");
  int num2 = input.nextInt();

  cl88a w = new cl88a(num1, num2);
  w.calc();

  int sum = w.getSum();
  int dif = w.getDif();
  int pro = w.getPro(); 
  int ave = w.getAve(); 
  int abs = w.getAbs(); 
  int max = w.getMax();

  System.out.println("Sum: " +sum+ "\nDifference: " +dif+ "\nProduct: " +pro+ "\nAverage: " + ave + "\nAbsolute value: " + abs + "Maximum value: " +max);
}
