package Q2.prog402a;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a.dat"));
            cl402a[] list = new cl402a[1000];
            int cnt = 0;
            double mean = 0.0;

            double asc = 0.0;
            int[] alsc = new int[100];
          
            while (input.hasNext()) {
               int id = input.nextInt();
               int scores = input.nextInt();

               if(id != -999) {
                   cl402a yikes = new cl402a(id, scores);
                   list[cnt] = yikes;
                   alsc[cnt] = scores;
                   cnt++;
               }
              asc += scores;
               mean = asc/cnt;

            }


            
          System.out.println("Id\t\tScore\tDiff");
            for (int lcv =0; lcv < cnt; lcv++) {
              double dif = Math.round((alsc[lcv] - mean)*100) / 100;
                System.out.println(list[lcv] + "\t\t" + dif);
            }
          System.out.println("Average score = " + mean);

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Id		Score		Difference
//257		115		15.0
//253		123		11.0
//246		116		4.0
//243		113		1.0
//239		112		-3.0
//239		104		-3.0
//238		110		-4.0
//243		218		1.0
//242		208		0.0
//223		222		-19.0
//230		223		-12.0
//229		213		-13.0
//228		207		-14.0
//224		203		-18.0
//265		305		23.0
//262		306		20.0
//256		311		14.0
//246		325		4.0
//245		321		3.0
//245		323		3.0
//242		301		0.0
//Average score = 242.0
