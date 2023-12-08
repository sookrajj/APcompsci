package Q2.prog215hcl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog215h {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog215h.txt"));
            ArrayList<String> list = new ArrayList<>();



            while (s.hasNext()) {
                double num1 = s.nextDouble();
                double num2 = s.nextDouble();
                double num3 = s.nextDouble();
                double num4 = s.nextDouble();
                double num5 = s.nextDouble();
                double num6 = s.nextDouble();
                double num7 = s.nextDouble();
                double num8 = s.nextDouble();
                runnerscore hi = new runnerscore(num1, num2, num3, num4, num5, num6, num7, num8);
                hi.calc();
                list.add(hi.toString());

            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                System.out.println(list.get(lcv));
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
