package Q2.prog410tacl;

import Q2.prog435acl.cl435a;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class prog410t {
  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(new File("Langdat/survey2.dat"));
      Scanner s2 = new Scanner(new File("Langdat/survey.dat"));
      int cnt = 0;
      cl410t[] ret = new cl410t[100];
      int[] ho = new int[50];
      double mean = 0.0;
      double pov = 0.0;

      while (s.hasNext()) {
        int ids = s.nextInt();
        int incs = s.nextInt();
        int mems = s.nextInt();
       // for (int lcv = 0; lcv < cnt; lcv++) {
        //  cl410t cool = new cl410t(ids, incs, mems);
        //  ret[lcv] = cool;

        if(ids != -999) {
          cl410t yikes = new cl410t(ids, incs, mems);
          ret[cnt] = yikes;
          cnt++;
        }
        cl410t cool = new cl410t(ids, incs, mems);
        cool.calc();
        mean = cool.getTot();
        ho = cool.getHo();
        pov = cool.getpov();

      }

      
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
