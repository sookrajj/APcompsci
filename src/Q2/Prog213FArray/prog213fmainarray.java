package Q2.Prog213FArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213fmainarray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));
            cl213farray[] list = new cl213farray[1000];
            int cnt = 0;

            while (input.hasNext()) {
               int kwh = input.nextInt();


               if(kwh != -999) {
                   cl213farray yikes = new cl213farray(kwh);
                   list[cnt] = yikes;
                   cnt++;
               }

            }
            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].calc();
            }
            for (int lcv =0; lcv < cnt; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//the number of 93.66000000000001
//the number of 521.55
//the number of 682.44