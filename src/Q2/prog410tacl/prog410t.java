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
      String[] ho = new String[50];
      double mean = 0.0;
      double pov = 0.0;
      int ye = 0;
      int[] ids = new int[50];
      int[] incs = new int[50];
      int[] mems = new int[50];

      cl410t hi = new cl410t();

      while (s.hasNext()) {
        ids[ye] = s.nextInt();
        incs[ye] = s.nextInt();
        mems[ye] = s.nextInt();

        // for (int lcv = 0; lcv < cnt; lcv++) {
        //  cl410t cool = new cl410t(ids, incs, mems);
        //  ret[lcv] = cool;


        ye++;

      }
      while (s2.hasNext()) {
          ids[ye] = s2.nextInt();
          incs[ye] = s2.nextInt();
          mems[ye] = s2.nextInt();

          ye++;
      }

      for (int lcv = 0; lcv < ye; lcv++) {
        cl410t yikes = new cl410t(ids[cnt], incs[cnt], mems[cnt], ye);
        yikes.calc();
        ret[cnt] = yikes;
        cnt++;

        mean = yikes.getTot();
        ho = yikes.getHo();
        pov = yikes.getpov();
      }
      for (int lcv = 0; lcv < ye; lcv++) {
          for(int lcv2 = 0; lcv2 < ye-1; lcv2++) {
              if (ids[lcv2] < ids[lcv2+1]) {
                  cl410t temp = ret[lcv2];
                  ret[lcv2] = ret[lcv2+1];
                  ret[lcv2+1] = temp;

              }
          }
      }

      System.out.println(ye);
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
