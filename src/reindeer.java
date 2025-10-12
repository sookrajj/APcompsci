import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class reindeer {
    public static int counter = 0;
    //1 = north, 2 = east, 3 = south, 4 = west
    public static int mazesolver(int tot, int placex, int placey, int endx, int endy, String[][] mat, int iter, int prev, Map<Integer, ArrayList<Integer>> map) {
        int[] arr = new int[16];
        if (map.containsKey(placex)) {
            // System.out.print(placex);
            var list = map.get(placex);
            if (list.contains(placey)) {
                // counter++;
                // System.out.println(map);
                // System.out.println(placex + " " + placey);
                // map.get(placex).push(placey);  
                return 20000000;
            }
        }
        counter++;
        
        if (map.containsKey(placex)) {
            map.get(placex).add(placey);      
        }else {
            map.put(placex, new ArrayList<>());
            map.get(placex).add(placey); 
        }
        System.out.println(iter);
        if (iter > 1000) return 10000000;
        if (tot > 200000) return 10000000;
        if (placex >= mat.length-1 || placey >= mat[0].length-1 || placex == 0 || placey == 0) return 1000000;
        if (endx == placex && endy == placey) {
            System.out.println("yippie");
            return tot;
        }
        // if (endx == placex || endy == placey) {
        // System.out.println(placex + " " + placey);
        // }
        boolean eup = mat[placex+1][placey].equals("E");
        boolean edown = mat[placex-1][placey].equals("E");
        boolean eleft = mat[placex][placey-1].equals("E");
        boolean eright = mat[placex][placey+1].equals("E");
        if (prev == 1 && eup) {
            System.out.println("h");
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1;
        } else if (eup) {
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1001;
        }
        if (prev == 2 && eright) {
            System.out.println("i");
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1;
        } else if (eright) {
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1001;
        }
        if (prev == 3 && edown) {
            System.out.println("o");
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1;
        } else if (edown) {
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1001;
        }
        if (prev == 4 && eleft) {
            System.out.println("p");
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1;
        } else if (eleft) {
            map.get(placex).remove(map.get(placex).indexOf(placey));
            return tot+1001;
        }
        // System.out.println((endx == placex) + " " + (endy == placey));
        boolean up = mat[placex+1][placey].equals(".");
        boolean down = mat[placex-1][placey].equals(".");
        boolean left = mat[placex][placey-1].equals(".");
        boolean right = mat[placex][placey+1].equals(".");
        if (prev == 0 && down && right) {
            int p = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();           
            int o = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o;
        } else if (prev == 0 && down ) {
            // System.out.println("start");
            int p = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            // System.out.println("finish" + p);
            arr[0] = p;
        } else if (prev == 0 && right) {
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o;
        }
        if (prev == 1 && up && left && right) {
            int p = mazesolver(tot+1, placex+1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o < po ? o : po;
        } else if (prev == 1 && up && right) {
            int p = mazesolver(tot+1, placex+1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p <  po ? p : po;
        } else if (prev == 1 && up && left) {
            int p = mazesolver(tot+1, placex+1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o;
        } else if (prev == 1 && left && right) {
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po= mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o < po ? o : po;
        } else if (prev == 1 && up) {
            int p = mazesolver(tot+1, placex+1, placey, endx, endy, mat, iter+1, prev, map);
            arr[0] = p;
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
        } else if (prev == 1 && right) {
            int po= mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = po;
        } else if ( prev == 1 && left) {
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o;
        }
        if (prev == 2 && up && down && right) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1, placex, placey+1, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o < po ? o : po;
        } else if(prev == 2 && up && right) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1, placex, placey+1, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p <  po ? p : po;
        } else if (prev == 2 && down && right) {
            // if (placex == 11) System.out.println("placex = 11 ");
            int po= mazesolver(tot+1, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            int o = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            // if (placex == 11) System.out.println("p" + placex + " " + (placey+1));
            // if (placex == 11) System.out.println(map);
    
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o < po ? o : po;
        } else if (prev == 2 && up && down) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o;
        } else if (prev == 2 && right) {
            
            int po= mazesolver(tot+1, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // System.out.print("p" + placex + " " + (placey+1));
            // System.out.println();
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = po;
        } else if (prev == 2 && up) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            arr[0] = p;
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
        } else if ( prev == 2 && down) {
            int o = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o;
        }
        if (prev == 3 && down && left && right) {
            int p = mazesolver(tot+1, placex-1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o < po ? o : po;
        } else if(prev == 3 && down && right) {
            // if (placex == 5) System.out.println("placex = 5 ");
            int p = mazesolver(tot+1, placex-1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            // if (placex == 5) System.out.println("p" + placex + " " + (placey+1));
            // if (placex == 5) System.out.println(map);
            int po = mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            
            arr[0] = p <  po ? p : po;
        } else if (prev == 3 && down && left) {
            int p = mazesolver(tot+1, placex-1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o;
        } else if (prev == 3 && left && right) {
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po= mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o < po ? o : po;
        } else if (prev == 3 && down) {
            int p = mazesolver(tot+1, placex-1, placey, endx, endy, mat, iter+1, prev, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p;
        } else if (prev == 3 && right) {
            int po= mazesolver(tot+1001, placex, placey+1, endx, endy, mat, iter+1, 2, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = po;
        } else if ( prev == 3 && left) {
            int o = mazesolver(tot+1001, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o;
        }
        if (prev == 4 && up && left && down) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o < po ? o : po;
        } else if (prev == 4 && left && down) {
            int o = mazesolver(tot+1, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o < po ? o : po;
        } else if (prev == 4 && up && left) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int o = mazesolver(tot+1, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p < o ? p : o;
        } else if(prev == 4 && up && down) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            // if (!map.get(placex).isEmpty())map.get(placex).pop();
            int po = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = p <  po ? p : po;
        } else if ( prev == 4 && left) {
            int o = mazesolver(tot+1, placex, placey-1, endx, endy, mat, iter+1, 4, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = o;
        } else if (prev == 4 && up) {
            int p = mazesolver(tot+1001, placex+1, placey, endx, endy, mat, iter+1, 1, map);
            arr[0] = p;
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
        } else if (prev == 4 && down) {
            int po = mazesolver(tot+1001, placex-1, placey, endx, endy, mat, iter+1, 3, map);
            // if (!map.get(placex).isEmpty())map.get(placex).remove(map.get(placex).indexOf(placey));
            arr[0] = po;
        }
        if (map.get(placex).contains(placey)) {
            map.get(placex).remove(map.get(placex).indexOf(placey));
            // System.out.println(map.get(placex).contains(placey));
        }
        if (arr[0] == 0) return 10000000;
        return arr[0];
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