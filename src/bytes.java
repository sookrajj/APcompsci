import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class bytes {
    public static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    public static int good(String[][] strs, int x, int y, int iter) {
        if (iter > 20) return 100000;
        if (map.containsKey(x)) {
            if (map.get(x).contains(y)) System.out.println("hi");return 1000000;
        } else {
            map.put(x, new ArrayList<>());
        }
        map.get(x).add(y);
        if (x == strs.length-1 && y == strs[0].length-1) return 0;
        ArrayList<Integer> vals = new ArrayList<>();
        if (x == 0) {
            if (y == 0) {
                vals.add(1+ good(strs, x+1, y, iter+1));
                vals.add(1+ good(strs, x, y+1, iter+1));
            } else if (y == strs[0].length-1) {
                vals.add(1+ good(strs, x+1, y, iter+1));
                vals.add(1+ good(strs, x, y-1, iter+1));
            } else {
                vals.add(1+ good(strs, x+1, y, iter+1));
                vals.add(1+ good(strs, x, y-1, iter+1));
                vals.add(1+ good(strs, x, y+1, iter+1));
            }
        } else if (x == strs.length-1) {
            if (y == 0) {
                vals.add(1+ good(strs, x-1, y, iter+1));
                vals.add(1+ good(strs, x, y+1, iter+1));
            } else if (y == strs[0].length-1) {
                vals.add(1+ good(strs, x-1, y, iter+1));
                vals.add(1+ good(strs, x, y-1, iter+1));
            } else {
                vals.add(1+ good(strs, x-1, y, iter+1));
                vals.add(1+ good(strs, x, y-1, iter+1));
                vals.add(1+ good(strs, x, y+1, iter+1));
            }
        } else {
            if (y == 0) {
                vals.add(1+ good(strs, x+1, y, iter+1));
                vals.add(1+ good(strs, x, y+1, iter+1));
                vals.add(1+ good(strs, x-1, y, iter+1));
            } else if (y == strs[0].length-1) {
                vals.add(1+ good(strs, x-1, y, iter+1));
                vals.add(1+ good(strs, x, y-1, iter+1));
                vals.add(1+ good(strs, x+1, y, iter+1));
            } else {
                vals.add(1+ good(strs, x+1, y, iter+1));
                vals.add(1+ good(strs, x, y+1, iter+1));
                vals.add(1+ good(strs, x-1, y, iter+1));
                vals.add(1+ good(strs, x, y-1, iter+1));
            }
        }
        System.out.println(map.get(x).remove(map.get(x).indexOf(y)));
        int min = 11111110;
        for (int i : vals) min = min > i ? i : min;
        return min;
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/bytestest.dat"));
            long tot = 0;
            String[][] strs = new String[7][7];
            for (int i = 0; i < strs.length; i++) for (int l = 0; l < strs[i].length; l++) strs[i][l] = ".";
            while (input.hasNext()) {
                var line = input.nextLine();
                String[] g = line.split(",");
                strs[Integer.parseInt(g[0])][Integer.parseInt(g[1])] = "#";
            }
            System.out.println(good(strs, 0, 0, 0));
            
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
