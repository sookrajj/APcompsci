package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class prog505a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505a.dat"));
            List<cl505a> list = new ArrayList<>();


            while (s.hasNext()) {
                String fName = s.next();
                String lname = s.next();
                int books = s.nextInt();
                String name = fName + " " + lname;

                cl505a wowser = new cl505a(name, books);
                list.add(wowser);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                cl505a cur = list.get(lcv);
                cur.calc();

            }

            for (cl505a x : list) {
                System.out.println(x);
            }

            double tot = 0;
            for (cl505a p : list) { tot += p.getPoints();}
            double avg = tot / list.size();
            System.out.println("\nAverage Points " + avg);

            int bigPoints = list.get(0).getPoints();
            int index = 0;

            for (int lcv = 1; lcv < list.size(); lcv++) {
                if (list.get(lcv).getPoints() > bigPoints) {
                    bigPoints = list.get(lcv).getPoints();
                    index = lcv;
                }
            }
            System.out.println("\nThe person with the biggest points is " + list.get(index).toString());


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
