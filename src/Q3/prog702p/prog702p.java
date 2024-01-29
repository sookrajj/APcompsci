package Q3.prog702p;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog702p {
    public static void main(String[] args) {
      try {
        Scanner s = new Scanner(new File("Langdat/prog701g.dat"));
        ArrayList<Animals> animal = new ArrayList<>();
        String name = "";
        String word = "";


        int num = s.nextInt();
        while (num != 99) {

          if (num == 1) {
            name = s.next();
            word = s.next();

            double furcost = s.nextDouble();
            Animals hicca = new hiccas(name, word, furcost);
            animal.add(hicca);

            System.out.println("Hicca's name is: " + name + " " + word);
            System.out.println("Its fur is worth: " + furcost);

          } else if (num == 2) {
            name = s.next();
            word = s.next();

            int steps = s.nextInt();
            Animals wallie = new wallies(name, word, steps);
            animal.add(wallie);
            System.out.println("Wallie's name is: " + name + " " + word);
            System.out.println("Wallie has taken : " + steps + " steps");
          } else if (num == 3) {
            name = s.next();
            word = s.next();

            String fav = s.next();
            Animals beeper = new beepers(name, word, fav);
            animal.add(beeper);

            System.out.println("Beeper's name is " + name + " " + word);
            System.out.println("Beeper's favorite word is: " + fav);

          }

          num = s.nextInt();
          System.out.println();
        }
        int cnth = 0;
        int cntw = 0;
        int cntb = 0;
        double fur = 0;
        int step = 0;
        String words = "";
        int[] cnt = new int[26];
        String alp = "abcdefghijklmnopqrstuvwxyz";
        for (int lcv = 0; lcv < cnt.length; lcv++) {
          cnt[lcv] = 0;
        }


        for (Animals x : animal) {
          if (x instanceof hiccas) {
            cnth++;
            fur += ((hiccas)x).getfur();
          } else if (x instanceof wallies) {
            cntw++;
            step += ((wallies)x).getSteps();
          } else {
            cntb++;
            words += ((beepers)x).getfav();
          }
        }

        for (int lcv = 0; lcv < words.length(); lcv++) {
          for (int r = 0; r < alp.length() - 1; r++) {
            if (words.substring(lcv, lcv + 1).equals(alp.substring(r, r + 1))) {
              cnt[r]++;
            }
          }
        }
        System.out.println("The average value of the Hicca fur is: " + fur / cnth);
        System.out.println("The average number of steps taken by the Wallies is:  " + (double) step / cntw);
        System.out.println("The average size of the Beepers words is: " + (double) words.length() / cntb);

        int fir = cnt[0];
        int sec = 0;
        int thir = 0;
        for (int lcv = 1; lcv < cnt.length; lcv++) {
          if (fir == cnt[lcv]) {
            if (sec == cnt[lcv] && sec == fir) thir = cnt[lcv];
            else sec = cnt[lcv];
          } else if (fir < cnt[lcv]) fir = cnt[lcv];



        }
        if (fir > sec)
          System.out.println("The most common letter(s) in all the Beepers' words is: " + alp.substring(fir, fir+1));
        else if (sec > thir && fir == sec)
          System.out.println("The most common letter(s) in all the Beepers' words is: " + alp.substring(fir, fir+1) + " " + alp.substring(sec, sec+1));
        else {
          System.out.println("The most common letter(s) in all the Beepers' words is: " + alp.substring(fir, fir+1) + " " + alp.substring(sec, sec+1) + " " + alp.substring(thir, thir+1));
        }
        } catch(Exception e){
          System.out.println("Can't find data file.");
        }
    }

}

