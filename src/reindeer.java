import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class numl {
    public static int counter = 0;
    //1 = north, 2 = east, 3 = south, 4 = west
    public static int mazesolver(int tot, int placex, int placey, int endx, int endy, String[][] mat, int iter, int prev, Map<Integer, Stack<Integer>> map) {
        int[] arr = new int[16];
        if (map.containsKey(placex)) {
            // System.out.print(placex);
            var list = map.get(placex);
            if (list.contains(placey)) {
                // counter++;
                map.get(placex).push(placey);  
                return 2000000;
            }
        }
        counter++;
        if (map.containsKey(placex)) {
            map.get(placex).push(placey);      
        }else {
            map.put(placex, new Stack<>());
            map.get(placex).push(placey); 
        }

        if (iter > 400) return tot;
        if (tot > 15000) return tot;
        if (endx == placex && endy == placey) {
            // System.out.println("yippie");
            return tot;
        }
        // if (endx == placex || endy == placey) {
        // System.out.println(placex + " " + placey);
        // }
        boolean eup = mat[placex][placey+1].equals("E");
        boolean edown = mat[placex][placey-1].equals("E");
        boolean eleft = mat[placex-1][placey].equals("E");
        boolean eright = mat[placex+1][placey].equals("E");
        if (prev == 1 && eup) {
            return tot+1;
        }
        if (prev == 2 && eright) {
            return tot+1;
        } 
        if (prev == 3 && edown) {
            return tot+1;
        } 
        if (prev == 4 && eleft) {
            return tot+1;
        } 
        // System.out.println((endx == placex) + " " + (endy == placey));
        boolean up = mat[placex][placey+1].equals(".");
        boolean down = mat[placex][placey-1].equals(".");
        boolean left = mat[placex-1][placey].equals(".");
        boolean right = mat[placex+1][placey].equals(".");
        if (prev == 1 && up) {
            arr[0] = mazesolver(tot+1, placex, placey+1, endx, endy, mat, iter+1, prev, map);
            map.get(placex).pop();
        }
        if (prev== 2 && right) {
            arr[1] = mazesolver(tot+1, placex+1, placey, endx, endy, mat, iter+1, prev, map);
            map.get(placex+1).pop();
        } 
        if (prev == 3 && down) {
            arr[2] = mazesolver(tot+1, placex, placey-1, endx, endy, mat, iter+1, prev, map);
            map.get(placex).pop();
        } 
        if (prev == 4 && left) {
            arr[3] = mazesolver(tot+1, placex-1, placey, endx, endy, mat, iter+1, prev, map);
            map.get(placex-1).pop();
        } 
        if (prev == 1 && left) {
            arr[4] = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 4, map);
            map.get(placex-1).pop();
        }
        if (prev == 1 && right) {
            arr[5] = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 2, map);
            map.get(placex+1).pop();
        }
        if (prev == 2 && up) {
            arr[6] = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 1, map);
            map.get(placex).pop();
        } 
        if (prev == 2 && down) {
            arr[7] = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 3, map);
            map.get(placex).pop();
        } 
        if (prev == 3 && left) {
            arr[8] = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 4, map);
            map.get(placex-1).pop();
        } 
        if (prev == 3 && right) {
            arr[9] = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 2, map);
            map.get(placex+1).pop();
        } 
        if (prev == 4 && up) {
            arr[10] = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 1, map);
            map.get(placex).pop();
        } 
        if (prev == 4 && down) {
            arr[11] = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 3, map);
            map.get(placex).pop();
        } 
        if (prev == 0 && up) {
            arr[12] = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 1, map);
            map.get(placex).pop();
        } 
        if (prev == 0 && down) {
            arr[13] = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 3, map);
            map.get(placex).pop();
        } 
        if (prev == 0 && left) {
            arr[14] = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 4, map);
            map.get(placex-1).pop();
        } 
        if (prev == 0 && right) {
            arr[15] = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 2, map);
            map.get(placex+1).pop();
        }
        int low = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // System.out.println(arr[i]);
                if (arr[i] < low) low = arr[i];
            }
        }
        return low;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/maze.dat"));
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
            var endx = 0; var endy = 0; var stx = 0; var sty = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[0].length; l++) {
                    if (mat[i][l].equals("S")) {
                        stx = i;
                        sty = l;
                    }
                    if (mat[i][l].equals("E")) {
                        endx = i;
                        endy = l;
                    }
                }
            }
            // System.out.println(stx + " " + sty);
            System.out.println(mazesolver(0, stx, sty, endx, endy, mat, 0, 0, new HashMap<>()));
            System.out.println(counter);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   