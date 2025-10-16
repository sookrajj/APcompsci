import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class RAM {
     public static int bread(int px, int py, String[][] mat) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(px*10000 + py);
         Queue<Integer> q = new Queue<>();
//        ArrayList<Integer> l = new ArrayList<>();
        int low = 1000000000;
        while (!queue.isEmpty()) {
            Integer node = queue.dequeue();
//            System.out.println(node);
            q.enqueue(node);
//            l.add(node);
            for (int i = 0; i < 7; i++) {
                for (int o = 0; o < 7; o++) {
                    System.out.print(mat[i][o]);
                }
                System.out.println();
            }
            mat[(int)Math.floor(node/10000.0)][node%10000] = "P";
//            System.out.print(node.data + " ");
            if ((int)Math.floor(node/10000.0)+1 == mat.length && node%10000+1 == mat[0].length){break;}

            if ((int)Math.floor(node/10000.0)+1 != mat.length) {
                if (mat[(int)Math.floor(node/10000.0)+1][node%10000].equals(".")) queue.enqueue(node+10000);
            }

            if ((int)Math.floor(node/10000.0)-1 != -1 ) {
                if (mat[(int)Math.floor(node/10000.0)-1][node%10000].equals(".")) queue.enqueue(node-10000);
            }
            if (node%10000+1 != mat[0].length ) {
                if (mat[(int)Math.floor(node/10000.0)][node%10000+1].equals(".")) queue.enqueue(node+1);
            }
            if (node%10000-1 != -1 ) {
                if (mat[(int)Math.floor(node/10000.0)][node%10000-1].equals(".")) queue.enqueue(node-1);
            }
            
        }
        ArrayList<Integer> what = new ArrayList<>();
        what.add(q.dequeue());
        for (int i = 0; i < q.size(); i++) {
            var t = q.dequeue();
            if (!what.contains(t)) what.add(t);
            i--;
        }
//         for (int p : l) System.out.println(p);
//        System.out.println();
        return what.size();
    }
  
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/RAMtest.dat"));
            long tot = 0;
            ArrayList<String> str = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                var line = input.nextLine();
                str.add(line);
            }
            String[][] strs = new String[7][7];
            for (int i = 0; i < 7; i++) {
                for (int l = 0; l < 7; l++) {
                    strs[i][l] = ".";
                }
            }

            for (int i = 0; i < 12; i++) {
                for (int l = 0; l < str.get(i).length(); l++) {
                    int pox = Integer.parseInt(str.get(i).split(",")[0]);
                    int poy = Integer.parseInt(str.get(i).split(",")[1]);
                    strs[pox][poy] = "#";
                }
            }
//            for (int i = 0; i < 71; i++) {
//                for (int l = 0; l < 71; l++) {
//                    System.out.print(strs[i][l]);
//                }
//                System.out.println();
//            }
            int px = 0;
            int py = 0;
            // for (int i = 0; i < strs.length(); i++) for (int l = 0; l < strs[0].length; l++) if (mat[i][l].equals("S")) px = i; py = l;
            
            System.out.println(bread(px, py, strs));
//            for (int i = 0; i < 71; i++) {
//                for (int l = 0; l < 71; l++) {
//                    System.out.print(strs[i][l]);
//                }
//                System.out.println();
//            }
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
