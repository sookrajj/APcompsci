package Q2;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));
            cl435a[] list = new cl435a[1000];
            int cnt = 0;

            while (input.hasNext()) {
              int ctype = input.nextInt();
              int gate = input.nextInt();

               if(kwh != -999) {
                   cl435a yikes = new cl435a(ctype, gate);
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
