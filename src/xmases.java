import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class xmases {
    // public static int counter = 0;
    //1 = north, 2 = east, 3 = south, 4 = west
    // public static int puzzlesolver(int tot, int placex, int placey, int endx, int endy, String[][] mat, int iter, int prev, Map<Integer, Stack<Integer>> map) {
        
    // }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/xmas.dat"));
            ArrayList<String> pre = new ArrayList<>();
            // boolean pre = true;
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
            

            int count = 0;
            for (int i = 1; i < mat.length-1; i++) {
                for (int l = 1; l < mat[0].length-1; l++) {
                    // System.out.print(mat[i][l]);
                    if (mat[i][l].equalsIgnoreCase("A")) {
                        var dir1 = mat[i-1][l-1] + mat[i][l] + mat[i+1][l+1];
                        var dir2 = mat[i+1][l-1] + mat[i][l] + mat[i-1][l+1];
                        var dir3 = mat[i-1][l+1] + mat[i][l] + mat[i+1][l-1];
                        var dir4 = mat[i+1][l+1] + mat[i][l] + mat[i-1][l-1];
                        if (dir1.equals("MAS") &&(dir2.equals("MAS") || dir3.equals("MAS"))) {
                            count++;
                        }
                        if (dir4.equals("MAS") &&(dir2.equals("MAS") || dir3.equals("MAS"))) {
                            count++;
                        }
                    }
                }
                // System.out.println();
            }
            System.out.println(count);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   