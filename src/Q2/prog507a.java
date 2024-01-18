package Q2;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog507a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog507a.dat"));
            ArrayList<String> hi = new ArrayList<>;
            ArrayList<Integer> grade = new ArrayList<>;
            ArrayList<Integer> age = new ArrayList<>;
            ArrayList<Integer> movies = new ArrayList<>;
            int cnt = 0;
            

            while (!(s.nextLine().equals("Done"))) {
                hi.add(cnt) = s.nextLine() + s.nextLine();
                grade.add(cnt) = s.nextInt();
                age.add(cnt) = s.nextInt();
                movies.add(cnt) = s.nextInt();
              
                cnt++;
            }
            int teach = -1;
            boolean reduce = false;

            for (int r = 0; r < grades.size(); r++) {
                if (grade.get(r) == 20) {
                    teacher = r;
                    if (age.get(r) == 1) reduce = true;
                }
            }
            String[][] love = new String[hi.size()+1][1];
            int mit = 0;
            int mos = 0;
            String level = teacher;

            if (hi.size() >= 10) {
                for (int lcv = 0; lcv < hi.size(); lcv++) {
                  if (grade.get(lcv) == 9) level = "Freshmen";
                  else if (grade.get(lcv) == 10) level = "Sophomore";
                  else if (grade.get(lcv) == 11) level = "Junior\t";
                  else if (grade.get(lcv) == 12) level = "Senior\t";
                  love[lcv][0] += "\t\t" + level;

                  if (age.get(lcv)  < 18) {
                    love[lcv][0] += "\t$" + 5.00;
                    mit += 5;
                  } else {
                    love[lcv][0] += "\t$" + 10.00;
                    mit += 10;
                  }


                }
            }
                  
              



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
