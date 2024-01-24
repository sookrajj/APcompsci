package Q3.prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog701gm {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog701g.dat"));
            List<persons> list = new ArrayList<persons>();

            int num = s.nextInt();
            while (num != 99) {
                String fn = s.next();
                String ln = s.next();

                if (num == 1) {
                    double gpa = s.nextDouble();
                    persons p = new student(fn, ln, gpa);
                    list.add(p);
                } else if (num == 2) {
                    int studs = s.nextInt();
                    persons p = new Teacher(fn, ln, studs);
                    list.add(p);
                } else if (num == 3){
                    String favw = s.next();
                    persons p = new Admin(fn, ln, favw);
                    list.add(p);
                }

                num = s.nextInt();

            }

            double tot = 0;
            int cnt = 0;
            int totstus = 0;
            String lar = "";
            String sm = ";hgjhoitewjngvonfrgevkfedsnkjbvsfdhnbonubjotermbjnoiutrsjbonsjnbotrwoubntrnnvcxzlkjkooiugdhfnlhgmtkmorieshfungfdjbhikyrjihjdouysrtlkwerkgmpbfpojgfsohbugrsnjhtrmhmi hbdsuhgshtmhgnbininhtrmbpgfds[j bhgnhtsjrih";

            for (persons x : list) {
                if (x instanceof student) {
                    tot += ((student)x).getGPA();
                    cnt++;
                } else if (x instanceof Teacher) {
                    totstus += ((Teacher)x).getStuds();
                } else {
                    if (lar.length() < ((Admin)x).getFavw().length()) lar = ((Admin)x).getFavw();
                    if (sm.length() > ((Admin)x).getFavw().length()) sm = ((Admin)x).getFavw();
                }
            }

            System.out.printf("Average student GPA: %.2f\n", tot/cnt);
            System.out.println("Total number of students taught by teacher: " + totstus);
            System.out.println("Smallest favorite admin word: " + sm);
            System.out.println("Largest favorite admin word: " + lar);



        } catch (Exception e) {
            System.out.println("Can't find data file.");
        }
    }
}
