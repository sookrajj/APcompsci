package Q3.prog901a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog901a {
    public static void printFile(Scanner input) {
        String s = "";
        String[] h = new String[50];
        int cnt = 0;
        while(input.hasNext()) {
            s = input.nextLine();
            h[cnt] = reverseString(s);
            cnt++;
        }
        for (int lcv = h.length-1; lcv >= 0; lcv--) {
            if (h[lcv] != null) System.out.println(h[lcv]);
        }
        //for attempting recommit
    }
    public static  String reverseString(String s) {
        String rever = "";
        if (s.length() == 0) {
            return "";
        } else rever = s.substring(s.length()-1);
        return rever + reverseString(s.substring(0, s.length()-1));
    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog512h.dat"));
            printFile(s);

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//lufituaeb dna dalg sgnihT
//lla dna efil gninrom dooG
//klis ro ocilac ti eB
//klim sa etihw sa htolc nI
//erar os wohs a ekam tahT
//riaf nemow uoy ot liaH
//srewolf fo sdleif neerg uoy dnA
//srewob ydahs uoy ot liaH
//seton yb sevael rebmun dluoW
//staorht esohw sdrib uoy ot liaH
//hgih erusaem sduolc thgirb hcihW
//yks gninrom eht ot liaH
//dne on sah gnidneps siH
//dneirf taerg ym si nus ehT
//dlog eht snwo taht eh tuB
//dloh gnihton stekcop yM
//lufituaeb dna dalg sgnihT
//lla dna efil gninrom dooG