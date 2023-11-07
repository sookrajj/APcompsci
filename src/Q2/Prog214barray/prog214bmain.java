package Q2.Prog214barray;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog214bmain {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));
            cl214b[] list = new cl214b[1000];
            int cnt = 0;

            while (input.hasNext()) {
               int emnum = input.nextInt();
              double hrs = input.nextDouble();
              double rate = input.nextDouble();
              double shfac = input.nextDouble();
              double ytd = input.nextDouble();


               if(emnum != -999) {
                   cl213farray yikes = new cl213farray(hrs, rate, shfac, ytd, emnum);
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
