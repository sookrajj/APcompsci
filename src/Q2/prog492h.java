package Q2;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Basefile {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog492h.dat"));

            String[][] track = new String[30][30];

            for (int r = 0; r < track.length; r++) {
              for (int c = 0; c < track[0].length; c++) {
                track[r][c] = s.next();
              }
            }

            System.out.println("Generation 1");

            int fir = 30;
            int sec = 30;
            int las = 0;
            int clas = 0;

            for (int r = 0; r < track.length; r++) {
                for (int c = 0; c < track[0].length; c++) {
                  if (track[r][c].equals("*")) {
                    if (fir > r) fir = r;
                    if (sec > c) sec = c;
                    if (las < r) las = r;
                    if (clas < c) clas = c;
                  }
                }
            }

            for (int r = fir; r < las; r++) {
              for (int c = sec; c < clas; c++) {
                System.out.print(track[r][c] + " ");
              }
              System.out.println();
            }

            String[][] sub = new String[30][30];
            int surround = 0;
            for (int lcv = 2; lcv < 16; lcv++) {
              
              for (int r = 0; r < sub.length; r++) {
                for (int c = 0; c < sub.length; c++) {
                  sub[r][c] = " ";
                }
              }
              System.out.println("Generation " + lcv);
              
              for (int r = fir-2; r < las+2; r++) {
                for (int c = c-2; c < clas+2; c++) {
                  if (track[r+1][c+1].equals("*")) {
                    for (int right = r-1; right <= r+1; right++) {
                      for (int left = c-1; left <= c+1; left++) {
                        if (track[right][left].equals("*")) surround++;
                        surround--;
                      }
                    }
                    if (surround < 2 || surround > 4) sub[r][c] == "*";
                  } else {
                    for (int right = r-1; right <= r+1; right++) {
                      for (int left = c-1; left <= c+1; left++) {
                        if (track[right][left].equals("*")) surround++;
                        surround--;
                      }
                    }
                    if (surround == 3) sub[r][c] = "*";
                  }
                  surround = 0;
                }
              }
              fir = 30;
              sec = 30;
              las = 0;
              clas = 0;

              for (int r = 0; r < track.length; r++) {
                for (int c = 0; c < track[0].length; c++) {
                  track[r][c] = sub[r][c];
                  if (sub[r][c].equals("*")) {
                    if (fir > r) fir = r;
                    if (sec > c) sec = c;
                    if (las < r) las = r;
                    if (clas < c) clas = c;
                  }
                  sub[r][c] = " ";
                }
              }

              for(int r = fir; r < las; r++) {
                for (int c = sec; c < clas; c++) {
                  System.out.print(track[r][c] + " ");
                }
                System.out.println();
              }
            }

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
