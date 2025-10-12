import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class missilecode {
    // public static int counter = 0;
    //1 = north, 2 = east, 3 = south, 4 = west
    // public static int puzzlesolver(int tot, int placex, int placey, int endx, int endy, String[][] mat, int iter, int prev, Map<Integer, Stack<Integer>> map) {
        
    // }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/nuke.dat"));
            Map<Integer, ArrayList<Integer>> rules = new HashMap<>();
            int count = 0;
            boolean pre = true;
            while (input.hasNext()) {
                var line = input.next();
                if (line.contains(",")) pre = false;
                if (pre) {
                    var x = Integer.parseInt(line.substring(0,2));
                    var y = Integer.parseInt(line.substring(3));
                    if (rules.containsKey(x)) rules.get(x).add(y);
                    else {
                        rules.put(x, new ArrayList<>());
                        rules.get(x).add(y);
                    }
                } else {
                    var g = line.split(",");
                    boolean valid = true;
                    for (int i = 1; i < g.length; i++) {
                        var num = Integer.parseInt(g[i]);
                        if (rules.containsKey(num)) {
                            for (int l = 0; l < i; l++) {
                                if (rules.get(num).contains(Integer.parseInt(g[l]))) {
                                    valid = false;
                                    for (int p = l+1; p < i+1; p++) {
                                        var temp = g[l];
                                        g[l] = g[p];
                                        g[p] = temp;
                                    }
                                    i--;
                                }
                            }
                        }
                    }
                    for (String str : g) {
                        System.out.print(str + " ");
                    }
                    if (!valid) count += Integer.parseInt(g[g.length/2]);
                    System.out.println();
                }

            }
            
            System.out.println(count);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   