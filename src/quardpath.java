import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class quardpath {
    public static int counter = 0;
    //1 = north, 2 = east, 3 = south, 4 = west
    public static int mazesolver(int tot, int placex, int placey, String[][] mat, int prev) {
        // System.out.println(placex + " " + placey);
        if (tot > 8000) return -1;
        // System.out.println(tot);
        if (placex+1 >= mat.length || placex-1 < 0 || placey-1 < 0 || placey+1 > mat[0].length) return tot;
        // mat[placex][placey] = "*";
        if (prev == 1 && placex > 0) {
            if (mat[placex-1][placey].equals("#")) {
                return mazesolver(tot+1, placex, placey, mat, 2);
            } else {
                return mazesolver(tot+1, placex-1, placey, mat, prev);
            }
        }
        if (prev == 2 && placey+1 < mat[0].length) {
            if (mat[placex][placey+1].equals("#")) {
                return mazesolver(tot+1, placex, placey, mat, 3);
            } else {
                return mazesolver(tot+1, placex, placey+1, mat, prev);
            }
        }
        if (prev == 3 && placex+1 < mat.length) {
            if (mat[placex+1][placey].equals("#")) {
                return mazesolver(tot+1, placex, placey, mat, 4);
            } else {
                return mazesolver(tot+1, placex+1, placey, mat, prev);
            }
        }
        if (prev == 4 && placey > 0) {
            if (mat[placex][placey-1].equals("#")) {
                return mazesolver(tot+1, placex, placey, mat, 1);
            } else {
                return mazesolver(tot+1, placex, placey-1, mat, prev);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/guard.dat"));
            ArrayList<String> pre = new ArrayList<>();
            while (input.hasNext()) {
                var line = input.next();
                pre.add(line);

            }
            String[][] mat = new String[pre.size()][pre.get(0).length()];
            for (int i = 0; i < pre.size(); i++) {
                var line = pre.get(i);
                for (int l = 0; l < line.length(); l++) {
                    mat[i][l] = line.substring(l, l+1);
                }
            }
            var stx = 0; var sty = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[0].length; l++) {
                    // System.out.print(mat[i][l]);
                    if (mat[i][l].equals("^")) {
                        stx = i;
                        sty = l;
                    }
                }
                // System.out.println();
            }
            // System.out.println(stx + " " + sty);
            int stops = 0;
            // System.out.println(counter);
            // int c = 0;
            for (int q = 0; q < mat.length * mat[0].length; q++) {
                
                if (q == (stx * mat.length + sty)) q++;
                while (mat[(int)Math.floor(q/mat.length)][q%mat.length].equals("#")) {
                    q++;
                }
                // System.out.println((int)Math.floor(q/mat.length) + " " + q%mat.length);
                mat[(int)Math.floor(q/mat.length)][q%mat.length] = "#";
                if (mazesolver(0, stx, sty, mat, 1) == -1) stops++;
                mat[(int)Math.floor(q/mat.length)][q%mat.length] = ".";
            }
            System.out.println(stops);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   