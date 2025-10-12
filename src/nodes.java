import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class nodes {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/nodes.dat"));
            long tot = 0;
            ArrayList<String> str = new ArrayList<>();
            while (input.hasNext()) {
                var line = input.nextLine();
                str.add(line);
            }
            String[][] strs = new String[str.size()][str.get(0).length()];
            for (int i = 0; i < str.size(); i++) {
                for (int l = 0; l < str.get(0).length(); l++) {
                    strs[i][l] = str.get(i).substring(l, l+1);

                }
            }
            str.clear();
            str.add(".");
            String[][] ans = new String[strs.length][strs[0].length];
            for (int i = 0; i < strs.length; i++) for (int l = 0; l < strs[0].length; l++) ans[i][l] = ".";
            var cur = "";
            for (int i = 0; i < strs.length; i++) {
                for (int l = 0; l < strs[0].length; l++) {
                    if (!str.contains(strs[i][l])) {
                        cur = strs[i][l];
                        ArrayList<Integer> pos = new ArrayList<>();
                        for (int p = 0; p < strs.length; p++) {
                            for (int q = 0; q < strs.length; q++) {
                                if (strs[p][q].equals(cur)) {pos.add(p); pos.add(q);}
                            }
                        }
                        while (pos.size() > 2) {
                            var fx = pos.remove(0);
                            var fy = pos.remove(0);
                            for (int p = 0; p < pos.size(); p+=2) {
                                var sx = pos.get(p);
                                var sy = pos.get(p+1);
                                for (int s = -50; s < 50; s++) {
                                if (fx - (sx-fx)*s >= 0 && fx - (sx-fx)*s < strs.length) {
                                    if (fy - (sy-fy)*s >= 0 && fy - (sy-fy)*s < strs[0].length) {
                                        ans[fx - (sx-fx)*s][fy - (sy-fy)*s] = "#";
                                    }
                                }
                                if (sx + (sx-fx)*s >= 0 && sx + (sx-fx)*s < strs.length) {
                                    if (sy + (sy-fy)*s >= 0 && sy + (sy-fy)*s < strs[0].length) {
                                        ans[sx + (sx-fx)*s][sy + (sy-fy)*s] = "#";
                                    }
                                }
                                }
                            }
                                
                        }
                        str.add(cur);
                    }
                }
            }

            int count = 0;
            for (int i = 0; i < strs.length; i++) {for (int l = 0; l < strs[0].length; l++) {
                System.out.print(ans[i][l]);
                if (ans[i][l].equals("#")) count++;
            }System.out.println();}
            System.out.println(count);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   

