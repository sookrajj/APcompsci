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

      String[] ret = new String[100];
      String[] ho = new String[50];
      double mean = 0.0;
      double pov = 0.0;
      int ye = 0;
      int total = 0;
      int inc = 0;
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
        total += incs[ye];


        ye++;

      }
      while (s2.hasNext()) {
          ids[ye] = s2.nextInt();
          incs[ye] = s2.nextInt();
          mems[ye] = s2.nextInt();
          total += incs[ye];
          ye++;
      }

      for (int lcv = 0; lcv < ye; lcv++) {
        cl410t yikes = new cl410t(ids[lcv], incs[lcv], mems[lcv], total);
        yikes.calc();
        ret[lcv] = yikes.toString();


        mean = yikes.getTot();
        pov = yikes.getpov();

      }





      System.out.println("id     income    members");
      for (int lcv = 0; lcv < ye; lcv++) {
        System.out.println(ret[lcv]);
      }
      System.out.println("Households with income exceeding an average income of " + mean + "\nid     income    members");
      for (int lcv = 0; lcv < ye; lcv++) {
        if (incs[lcv] > mean) System.out.println(ret[lcv]);
      }
      System.out.println("Percent of households below poverty level = " + pov);
      
    } catch (IOException e) {
      System.out.println("Can't find data file.");
    }
  }
}
//id     income    members
//1041	12180	4
//1062	13240	3
//1327	19800	2
//1483	22458	8
//1900	17000	2
//2112	18125	7
//2345	15623	2
//3210	3200	6
//3600	6500	5
//3601	11970	2
//4725	8900	3
//6217	10000	2
//9280	6200	1
//2497	12500	2
//3323	13000	5
//4521	18210	4
//6789	8000	2
//5476	6000	1
//4423	16400	3
//6587	25000	4
//3221	10500	4
//5555	15000	2
//1085	19700	3
//3097	20000	8
//4480	23400	5
//2065	19700	2
//8901	13000	3
//Households with income exceeding an average income of 14281.703703703704
//id     income    members
//1327	19800	2
//1483	22458	8
//1900	17000	2
//2112	18125	7
//2345	15623	2
//4521	18210	4
//4423	16400	3
//6587	25000	4
//5555	15000	2
//1085	19700	3
//3097	20000	8
//4480	23400	5
//2065	19700	2
//Percent of households below poverty level = 0.037037037037037035