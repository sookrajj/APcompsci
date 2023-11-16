package Q2;
import java.util.*;
public class MSOE2016p9 {
  public static void main(String[] args) {
    Scanner turkeywasyummy = new Scanner(System.in);
    int[] nums = new int[9];
    System.out.println("Enter a series of 0's and 1's no longer than 9");
    int sers = turkeywasyummy.nextInt();
    while (sers != 0) {
      for (int lcv = 0; lcv < nums.length; lcv++) {
        nums[lcv] = (int) (sers / Math.pow(10, lcv));
        sers /= 10;
      }
    }
    for (int lcv = 0; lcv < nums.length; lcv++) {

    }
  }
}