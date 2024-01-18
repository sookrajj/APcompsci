package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog507 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog507a.dat"));
            ArrayList<String> hi = new ArrayList<String>();
            ArrayList<Integer> grade = new ArrayList<Integer>();
            ArrayList<Integer> age = new ArrayList<Integer>();
            ArrayList<Integer> movies = new ArrayList<Integer>();
            int cnt = 0;


            while (!(s.nextLine().equals("Done"))) {
                hi.add(cnt, s.nextLine() + s.nextLine());
                grade.add(cnt, s.nextInt());
                age.add(cnt, s.nextInt());
                movies.add(cnt,s.nextInt());

                cnt++;
            }
            int teacher = -1;
            boolean reduce = false;

            for (int r = 0; r < grade.size(); r++) {
                if (grade.get(r) == 20) {
                    teacher = r;
                    if (age.get(r) == 1) reduce = true;
                }
            }
            String[][] love = new String[hi.size()+1][1];
            int mit = 0;
            int mos = 0;
            int tot = 0;
            String level = "Teacher";

            System.out.println("Name\t\t\tGrade\t\tMIT Museum\tMuseum of Science");
            if (hi.size() >= 10) {
                for (int lcv = 0; lcv < hi.size(); lcv++) {
                    if (lcv == teacher){
                        cnt += 0;
                    } else{
                        if (grade.get(lcv) == 9) level = "Freshmen";
                        else if (grade.get(lcv) == 10) level = "Sophomore";
                        else if (grade.get(lcv) == 11) level = "Junior\t";
                        else if (grade.get(lcv) == 12) level = "Senior\t";
                        love[lcv][0] += "\t\t" + level;
                        tot += cnt * 10;
                        mos += cnt * 10;

                        if (age.get(lcv) < 18) {
                            love[lcv][0] += "\t$" + 5.00;
                            mit += 5;
                            tot += 5;
                        } else {
                            love[lcv][0] += "\t$" + 10.00;
                            mit += 10;
                            tot += 10;
                        }
                        love[lcv][0] += "\t\t$" + (movies.get(lcv) * 4 + 10);

                        mos += movies.get(lcv) * 4;
                        System.out.println();
                    }

                }
                love[love.length-1][0] = hi.get(teacher) + "\t\t\tTeacher\t\t\t$" + 10 + "\t\t\t$" + 0;
            } else {
                for (int lcv = 0; lcv < hi.size(); lcv++) {
                    if (grade.get(lcv) == 9) level = "Freshmen";
                    else if (grade.get(lcv) == 10) level = "Sophomore";
                    else if (grade.get(lcv) == 11) level = "Junior\t";
                    else if (grade.get(lcv) == 12) level = "Senior\t";
                    love[lcv][0] += "\t\t" + level;
                    tot += cnt * 25;
                    mos += cnt * 25;

                    if (age.get(lcv) < 18) {
                        love[lcv][0] += "\t$" + 5.00;
                        mit += 5;
                        tot += 5;
                    } else {
                        love[lcv][0] += "\t$" + 10.00;
                        mit += 10;
                        tot += 10;
                    }


                    if (movies.get(lcv) > 2) {
                        mos += (movies.get(lcv)-2 * 4) + 6;
                        love[lcv][0] += "\t\t$" + (movies.get(lcv)-2) * 4 + 25;
                    } else {
                        mos += 6;
                        love[lcv][0] += "\t\t$" + (6 + 25);
                    }
                    System.out.println();
                }
                love[love.length-1][0] = hi.get(teacher) + "\t\t\tTeacher\t\t\t$" + 10 + "\t\t\t$" + (25 + (movies.get(teacher) -2 * 4) + 6);
            }
            if (reduce == true) tot -= 50;

            System.out.println("The total cost to visit the MIT Museum is: $" + mit +
                    "\nThe total cost to visit the Museum of Science is: $" + mos +
                    "\n\t\t\t\t\tThe grand total is: $" + tot);


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
