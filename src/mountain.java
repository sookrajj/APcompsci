import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class mountain {
    public static int counter = 0;
    // public static Map<Integer, ArrayList<Integer>> nines = new HashMap<>();
    //px, py == 1
    public static int top(int px, int py, int[][] nums, int tg) {
        
        if (nums[px][py] != tg-1) return 0;
        // System.out.println(px + " " + py + " " + tg);
        if (tg == 10) {
            // if (nines.containsKey(px)) {
            //     if (nines.get(px).contains(py)) {
            //         return 0;
            //     }
            // } else {
            //     nines.put(px, new ArrayList<>());
            // }
            // nines.get(px).add(py);
            // System.out.println("counted");
            return 1;
        }
        if (px == 0) {
            if (py == 0) {
                return top(px+1, py, nums, tg+1) + top(px, py+1, nums, tg+1);
            } else if (py == nums[0].length-1) {
                return top(px+1, py, nums, tg+1) + top(px, py-1, nums, tg+1);
            } else {
                return top(px+1, py, nums, tg+1) + 
                top(px, py-1, nums, tg+1) + top(px, py+1, nums, tg+1);
            }
        } else if (px == nums.length-1) {
            if (py == 0) {
                return top(px-1, py, nums, tg+1) + top(px, py+1, nums, tg+1);
            } else if (py == nums[0].length-1) {
                return top(px-1, py, nums, tg+1) + top(px, py-1, nums, tg+1);
            } else {
                return top(px-1, py, nums, tg+1) + 
                top(px, py-1, nums, tg+1) + top(px, py+1, nums, tg+1);
            }
        } else {
            if (py == 0) {
                return top(px-1, py, nums, tg+1) + 
                top(px, py+1, nums, tg+1) + top(px+1, py, nums, tg+1);
            } else if (py == nums[0].length-1) {
                return top(px-1, py, nums, tg+1) + 
                top(px, py-1, nums, tg+1) + top(px+1, py, nums, tg+1);
            } else {
                return top(px-1, py, nums, tg+1) + top(px, py-1, nums, tg+1) +
                top(px, py+1, nums, tg+1) + top(px+1, py, nums, tg+1);
            }
        }

        // return 0;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/mount.dat"));
            ArrayList<String> pre = new ArrayList<>();
            while (input.hasNext()) {
                var line = input.next();
                pre.add(line);

            }
            int[][] mat = new int[pre.size()][pre.get(0).length()];
            for (int i = 0; i < pre.size(); i++) {
                var line = pre.get(i);
                for (int l = 0; l < line.length(); l++) {
                    mat[i][l] = Integer.parseInt(line.substring(l, l+1));
                }
            }
            
            // System.out.println(stx + " " + sty);
            int c = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[0].length; l++) {
                    
                    if (mat[i][l] == 0) {
                        int n = top(i, l, mat, 1);
                        c += n;
                        // System.out.println(n);
                        // nines.clear();
                    }
                }
            }
            System.out.println(c);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   