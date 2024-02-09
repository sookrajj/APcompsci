package Q3.prog295ccl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog295c {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/merge1.dat"));
            Scanner w = new Scanner(new File("Langdat/merge2.dat"));
            ArrayList<socialPerson> list = new ArrayList<socialPerson>();
            String soc = "";
            String ty = "";
            String cl = "";
            int cod = 0;
            String nums = "123456789";
            int cnt = 0;


            while (s.hasNext()) {
                soc = s.next();
                ty = s.next();
                cl = ty.substring(0, 1);
                ty = ty.substring(1);
                cod = 0;
                cnt = 0;
                while (cnt < nums.length() && cod == 0) {
                    if (nums.substring(cnt, cnt+1).equals(ty.substring(1,2))) cod = cnt+1;
                    cnt++;
                }
                list.add(new socialPerson(soc, ty, cl, cod));
            }
            while (w.hasNext()) {
                soc = w.next();
                ty = w.next();
                cl = ty.substring(0, 1);
                ty = ty.substring(1);
                cod = 0;
                cnt = 0;
                while (cnt < nums.length() && cod == 0) {
                    if (nums.substring(cnt, cnt+1).equals(ty.substring(1,2))) cod = cnt+1;
                    cnt++;
                }
                list.add(new socialPerson(soc, ty, cl, cod));
            }




        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
