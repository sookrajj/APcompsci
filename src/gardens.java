import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class gardens {
    public static int area(int tot, int px, int py, String find, String[][] mat, Map<Integer, ArrayList<Integer>> map, Boolean[][] been) {
        been[px][py] = true;
        if (px+1 < mat.length) {
            if (mat[px+1][py].equals(find)) {
                if (map.containsKey(px+1)) {
                    if (!map.get(px+1).contains(py)) {
                        map.get(px+1).add(py);
                        tot = area(tot+1, px+1, py, find, mat, map, been);
                    }
                } else {
                    map.put(px+1, new ArrayList<>());
                    map.get(px+1).add(py);
                    tot = area(tot+1, px+1, py, find, mat, map, been);
                }
            }
        }
        if (px-1 >= 0) {
            if (mat[px-1][py].equals(find)) {
                if (map.containsKey(px-1)) {
                    if (!map.get(px-1).contains(py)) {
                        map.get(px-1).add(py);
                        tot = area(tot+1, px-1, py, find, mat, map, been);
                    }
                } else {
                    map.put(px-1, new ArrayList<>());
                    map.get(px-1).add(py);
                    tot = area(tot+1, px-1, py, find, mat, map, been);
                }
            }
        }
        if (py+1 < mat[0].length) {
            if (mat[px][py+1].equals(find)) {
                if (map.containsKey(px)) {
                    if (!map.get(px).contains(py+1)) {
                        map.get(px).add(py+1);
                        tot = area(tot+1, px, py+1, find, mat, map, been);
                    }
                } else {
                    map.put(px, new ArrayList<>());
                    map.get(px).add(py+1);
                    tot = area(tot+1, px, py+1, find, mat, map, been);
                }
            }
        }
        if (py-1 >= 0) {
            if (mat[px][py-1].equals(find)) {
                if (map.containsKey(px)) {
                    if (!map.get(px).contains(py-1)) {
                        map.get(px).add(py-1);
                        tot = area(tot+1, px, py-1, find, mat, map, been);
                    }
                } else {
                    map.put(px, new ArrayList<>());
                    map.get(px).add(py-1);
                    tot = area(tot+1, px, py-1, find, mat, map, been);
                }
            }
        }
        return tot;
    }

    public static int perim(int tot, int px, int py, String find, String[][] mat, Map<Integer, ArrayList<Integer>> map) {

        if (px+1 >= mat.length) tot++;
        if (px-1 < 0) tot++;
        if (py+1 >= mat[0].length) tot++;
        if (py-1 < 0) tot++;
        if (px+1 < mat.length) {
            if (!mat[px+1][py].equals(find)) {
                if (!map.containsKey(px+1)) {
                    tot += 1;
                    map.put(px+1, new ArrayList<>());
                    map.get(px+1).add(py);
                } else {
                    if (!map.get(px+1).contains(py)) {
                        map.get(px+1).add(py);
                    }
                }
            } else {
                if (map.containsKey(px+1)) {
                    if (!map.get(px+1).contains(py)) {
                        map.get(px+1).add(py);
                        tot = perim(tot, px+1, py, find, mat, map);
                    }
                } else {
                    map.put(px+1, new ArrayList<>());
                    map.get(px+1).add(py);
                    tot = perim(tot, px+1, py, find, mat, map);
                }
            }
        }
        if (px-1 >= 0) {
            if (!mat[px-1][py].equals(find)) {
                if (!map.containsKey(px-1)) {
                    map.put(px-1, new ArrayList<>());
                    map.get(px-1).add(py);
                    tot += 1;
                } else {
                    if (!map.get(px-1).contains(py)) {
                        map.get(px-1).add(py);
                    }
                }
            } else {
                if (map.containsKey(px-1)) {
                    if (!map.get(px-1).contains(py)) {
                        map.get(px-1).add(py);
                        tot = perim(tot, px-1, py, find, mat, map);
                    }
                } else {
                    map.put(px-1, new ArrayList<>());
                    map.get(px-1).add(py);
                    tot = perim(tot, px-1, py, find, mat, map);
                }
            }
        }
        if (py+1 < mat[0].length) {
            if (!mat[px][py+1].equals(find)) {
                boolean add = true;
                for (Integer i : map.keySet()) {
                    if (map.get(i).contains(py+1)) add = false;
                }
                if (add) tot += 1;
                if (map.containsKey(px)) {
                    if (!map.get(px).contains(py+1)) {
                        map.get(px).add(py+1);
                    }
                } else {
                    map.put(px, new ArrayList<>());
                    map.get(px).add(py+1);
                }
            } else {
                if (map.containsKey(px)) {
                    if (!map.get(px).contains(py+1)) {
                        map.get(px).add(py+1);
                        tot = perim(tot, px, py+1, find, mat, map);
                    }
                } else {
                    map.put(px, new ArrayList<>());
                    map.get(px).add(py+1);
                    tot = perim(tot, px, py+1, find, mat, map);
                }
            }
        }
        if (py-1 >= 0) {
            if (!mat[px][py-1].equals(find)) {
                boolean add = true;
                for (Integer i : map.keySet()) {
                    if (map.get(i).contains(py-1)) add = false;
                }
                if (add) tot += 1;
                if (map.containsKey(px)) {
                    if (!map.get(px).contains(py-1)) {
                        map.get(px).add(py-1);
                    }
                } else {
                    map.put(px, new ArrayList<>());
                    map.get(px).add(py-1);
                }
            } else {
                if (map.containsKey(px)) {
                    if (!map.get(px).contains(py-1)) {
                        map.get(px).add(py-1);
                        tot = perim(tot, px, py-1, find, mat, map);
                    }
                } else {
                    map.put(px, new ArrayList<>());
                    map.get(px).add(py-1);
                    tot = perim(tot, px, py-1, find, mat, map);
                }
            }
        }
        return tot;
    }

    public static int newperim(int px, int py, String find, String[][] mat, Map<Integer, ArrayList<Integer>> map) {
        Map<Integer, ArrayList<Integer>> xcross = new HashMap<>();
        Map<Integer, ArrayList<Integer>> ycross = new HashMap<>();
        //adjust will give wrong number
        for (int i = 0; i < mat.length; i++) {
            for (int l = 0; l < mat[0].length; l++) {
                if (mat[i][l].equals(find)) {
                    if (xcross.containsKey(i)) {
                        xcross.get(i).add(l);
                    } else {
                        xcross.put(i, new ArrayList<Integer>);
                        xcross.get(i).add(l);
                    }
                    if (ycross.containsKey(l)) {
                        ycross.get(l).add(i);
                    } else {
                        ycross.put(l, new ArrayList<Integer>);
                        ycross.get(l).add(i);
                    }
                }
            }
        }
        int sides = 2;
        for(Integer key : xcross.keySet()) {
            var t = xcross.get(key);
            int count = t.get(0);
            for (int i = 1; i < tot.size()-1; i++) {
                if (xcross.containsKey(key-1)) {
                    var check = xcross.get(key-1);
                    //TODO: use checking against above and below to determine if adding a side is necessary.
                    if (
                }
            }
        }
        for(Integer key : xcross.keySet()) {
            var t = xcross.get(key);
            int count = t.get(0);
            sides++;
            for (int i = 1; i < tot.size()-1; i++) {
                if (t.get(i) != count+1) {
                    count++;
                    sides++;
                } else {
                    count++;
                }
            }
        }
    }


    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/gardens.dat"));
            ArrayList<String> temp = new ArrayList<>();
            while (input.hasNext()) {
                var line = input.next();
                temp.add(line);
                // System.out.println(nums.peek());
            }
            String[][] mat = new String[temp.size()][temp.get(0).length()];
            for(int i = 0; i < temp.size(); i++) {
                var line = temp.get(i);
                for (int l = 0; l < line.length(); l++) {
                    mat[i][l] = line.substring(l, l+1);
                }
            }
            temp.clear();
            int tot = 0;
            Boolean[][] been = new Boolean[mat.length][mat[0].length];
            for(int i = 0; i < mat.length; i++) {for (int l = 0; l < mat[0].length; l++) {been[i][l] = false;}}
            for(int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[0].length; l++) {
                    if (!been[i][l]) {
                        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
                        map.put(i, new ArrayList<>());
                        map.get(i).add(l);
                        System.out.println(perim(1, i, l, mat[i][l], mat, map));
                        map.clear();
                        map.put(i, new ArrayList<>());
                        map.get(i).add(l);
                        int area = area(1, i, l, mat[i][l], mat, map, been);
                        map.clear();
                        map.put(i, new ArrayList<>());
                        map.get(i).add(l);
                        int perim = perim(0, i, l, mat[i][l], mat, map);
                        tot += perim * area;
                    }
                }
            }
            System.out.println(tot);


        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
