package Q2.prog410tacl;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class prog410t {
  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(new File("Langdat/survey2.dat"));
      Scanner s2 = new Scanner(new File("Langdat/survey.dat"));
      int cnt = 1;
      int[] ret = new int[100];
      int[] ho = new int[50];
      double mean = 0.0;
      double pov = 0.0;

      while (s.hasNext()) {
        int id = s.nextInt();
        int incs = s.nextInt();
        int mems = s.nextInt();
        for (int lcv = 0; lcv < cnt; lcv++) {
          cl410tacl cool = new cl410tacl(ids, incs, mems);
          ret[lcv] = cool;
        }
        cnt++;
      }
      mean = cool.getTot();
      ho = cool.getho();
      pov = cool.getpov();
      
      System.out.println("id     income    members");
      for (int lcv = 0; lcv < cnt; lcv++) {
        System.out.println(ret[lcv]);
      }
      System.out.println("Households with income exceeding an average income of " + mean + "\nid     income    members");
      for (int lcv = 0; lcv < cnt; lcv++) {
        System.out.println(ho[lcv]);
      }
      System.out.println("Percent of households below poverty level = " + pov);
      
    } catch (IOException e) {
      System.out.println("Can't find data file.");
    }
  }
}
