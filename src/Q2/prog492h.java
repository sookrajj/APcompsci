package Q2;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog492h {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog492h.dat"));

            String[][] track = new String[30][30];
            String hi = "";

            while (s.hasNext()) {hi += s.next();}
            int cnt = 0;
            for (int r = 0; r < track.length; r++) {
              for (int c = 0; c < track[0].length; c++) {
                track[r][c] = hi.substring(cnt, cnt+1);
                cnt++;
              }
            }

            System.out.println("Generation 0");

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

            for (int r = fir; r < las+1; r++) {
              for (int c = sec; c < clas+1; c++) {
                  if (track[r][c].equals("*")) {
                      System.out.print(track[r][c] + " ");
                  } else System.out.print("  ");
              }
              System.out.println();
            }

            String[][] sub = new String[30][30];
            int surround = 0;
            for (int lcv = 1; lcv < 16; lcv++) {
              
              for (int r = 0; r < sub.length; r++) {
                for (int c = 0; c < sub.length; c++) {
                  sub[r][c] = ".";
                }
              }
              System.out.println("Generation " + lcv);
              
              for (int r = 2; r < track.length-2; r++) {
                for (int c = 2; c < track.length-2; c++) {
                  if (track[r][c].equals("*")) {
                    for (int right = r-1; right <= r+1; right++) {
                      for (int left = c-1; left <= c+1; left++) {
                        if (track[right][left].equals("*")) surround++;
                        if (right == r && left == c) surround--;
                      }
                    }
                    if (surround == 3 || surround == 2) sub[r][c] = "*";
                  } else {
                    for (int right = r-1; right <= r+1; right++) {
                      for (int left = c-1; left <= c+1; left++) {
                        if (track[right][left].equals("*")) surround++;

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
                  sub[r][c] = ".";
                }
              }

              for(int r = fir; r < las+1; r++) {
                for (int c = sec; c < clas+1; c++) {
                    if(track[r][c].equals("*")) {
                        System.out.print(track[r][c] + " ");
                    } else System.out.print("  ");
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
//Generation 0
//    *         *
//* *   * * * *   * *
//    *         *
//Generation 1
//* * * * * * * *
//*   * * * *   *
//* * * * * * * *
//Generation 2
//    * * * * * *
//  *             *
//*                 *
//  *             *
//    * * * * * *
//Generation 3
//      * * * *
//    * * * * * *
//  * * * * * * * *
//* *             * *
//  * * * * * * * *
//    * * * * * *
//      * * * *
//Generation 4
//        * *
//    *         *
//  *             *
//*                 *
//*                 *
//*                 *
//  *             *
//    *         *
//        * *
//Generation 5
//    *             *
//  * *             * *
//* * *             * * *
//  * *             * *
//    *             *
//Generation 6
//  * *             * *
//*     *         *     *
//*     *         *     *
//*     *         *     *
//  * *             * *
//Generation 7
//    * *             * *
//  *     *         *     *
//* * * * * *     * * * * * *
//  *     *         *     *
//    * *             * *
//Generation 8
//    * *             * *
//*         *     *         *
//*         *     *         *
//*         *     *         *
//    * *             * *
//Generation 9
//    *     *         *     *
//* * *     * * * * * *     * * *
//    *     *         *     *
//Generation 10
//*     *   * *   *     *
//* * * *   * *   * * * *
//*     *   * *   *     *
//Generation 11
//  *     *   * *   *     *
//* *     *         *     * *
//  *     *   * *   *     *
//Generation 12
//* *       *     *       * *
//* * * * *         * * * * *
//* *       *     *       * *
//Generation 13
//  *     * *         * *     *
//*       * * *     * * *       *
//  *     * *         * *     *
//Generation 14
//        *   *     *   *
//* *   *     *     *     *   * *
//        *   *     *   *
//Generation 15
//    *         *
//* *   * * * *   * *
//    *         *