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


      while (s.hasNext()) {
        ids[ye] = s.nextInt();
        incs[ye] = s.nextInt();
        mems[ye] = s.nextInt();

       // for (int lcv = 0; lcv < cnt; lcv++) {
        //  cl410t cool = new cl410t(ids, incs, mems);
        //  ret[lcv] = cool;


        ye++;
      }
      for (int lcv = 0; lcv < ye; lcv++) {
        cl410t yikes = new cl410t(ids[lcv], incs[lcv], mems[lcv]);
        yikes.calc();
        ret[cnt] = yikes;
        cnt++;

        mean = yikes.getTot();
        ho = yikes.getHo();
        pov = yikes.getpov();

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
