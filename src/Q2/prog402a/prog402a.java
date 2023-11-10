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
              double dif = Math.round((alsc[lcv] - mean)*100.0) / 100.0;
                System.out.println(list[lcv] + "\t\t" + dif);
            }
          System.out.println("Average score = " + mean);

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Id		Score	Diff
//115		257		14.38
//123		253		10.38
//116		246		3.38
//113		243		0.38
//112		239		-3.62
//104		239		-3.62
//110		238		-4.62
//218		243		0.38
//208		242		-0.62
//222		223		-19.62
//223		230		-12.62
//213		229		-13.62
//207		228		-14.62
//203		224		-18.62
//305		265		22.38
//306		262		19.38
//311		256		13.38
//325		246		3.38
//321		245		2.38
//323		245		2.38
//301		242		-0.62
//Average score = 242.61904761904762

