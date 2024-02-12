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
            sort sor = new sort(list);
            list = sor.sortSocials();
            System.out.println("social sec# Class Type Dept");
            for (socialPerson hi : list) {
                System.out.println(hi.getSocial() + " " + hi.getClas() + " " + hi.getType() + " " + hi.getCode());
            }




        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
// did it in reverse by accident
//social sec# Class Type Dept
//541-14-1237 C F5 5
//540-13-1236 D L9 9
//539-12-1235 D L9 9
//538-11-1234 D L9 9
//531-45-9260 C F5 5
//525-25-2525 A B1 1
//522-77-8767 C F5 5
//522-77-8766 C F5 5
//522-77-8765 C F5 5
//521-96-8743 C F5 5
//514-98-5555 C F5 5
//514-98-1234 A B1 1
//432-23-3489 A B1 1
//411-52-9485 D L9 9
//357-86-4219 C F5 5
//321-01-2345 A B1 1
//222-22-2227 D L9 9
//123-45-6789 C F5 5
//111-11-1111 A B1 1
//000-00-0001 A B1 1

//  actual correct
//social sec# Class Type Dept
//000-00-0001 A B1 1
//111-11-1111 A B1 1
//123-45-6789 C F5 5
//222-22-2227 D L9 9
//321-01-2345 A B1 1
//357-86-4219 C F5 5
//411-52-9485 D L9 9
//432-23-3489 A B1 1
//514-98-1234 A B1 1
//514-98-5555 C F5 5
//521-96-8743 C F5 5
//522-77-8765 C F5 5
//522-77-8766 C F5 5
//522-77-8767 C F5 5
//525-25-2525 A B1 1
//531-45-9260 C F5 5
//538-11-1234 D L9 9
//539-12-1235 D L9 9
//540-13-1236 D L9 9
//541-14-1237 C F5 5