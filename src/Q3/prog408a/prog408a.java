package Q3.prog408a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog408a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prg408a.dat"));
            Cl408a[] hi = new Cl408a[21];
            int cnt = 0;


            while (s.hasNext()) {
                hi[cnt] = new Cl408a(s.nextInt(), s.nextInt());
                cnt++;
            }
            hi = SortingAlgs.backinserSort(hi);
            System.out.println("ID\tScore");
            for (Cl408a item : hi) {
                System.out.println(item.getID() + "\t" + item.getScore());
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//ID	Score
//365	265
//306	262
//115	257
//311	256
//123	253
//325	246
//116	246
//323	245
//321	245
//113	243
//218	243
//208	242
//302	242
//104	239
//112	239
//110	238
//223	230
//213	229
//207	228
//203	224
//222	223