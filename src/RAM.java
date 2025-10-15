import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class RAM {
     public static int bread(int px, int py, String[][] mat) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(px*1000 + py);
        Queue<Integer> l = new Queue<>();
        while (!queue.isEmpty()) {
            Integer node = queue.dequeue();
            
            l.enqueue(node);
//            System.out.print(node.data + " ");
            if (Math.floor(node/1000)+1 == mat.length && node%1000+1 == mat[0].length) break;
            if (mat[Math.floor(node/1000)+1][node%1000].equals(".")) queue.enqueue(node+1000);
            if (mat[Math.floor(node/1000)-1][node%1000].equals(".")) queue.enqueue(node-1000);
            if (mat[Math.floor(node/1000)][node%1000+1].equals(".")) queue.enqueue(node+1);
            if (mat[Math.floor(node/1000)][node%1000-1].equals(".")) queue.enqueue(node-1);
            
        }
//        System.out.println();
        return l.size();
    }
  
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/nodes.dat"));
            long tot = 0;
            ArrayList<String> str = new ArrayList<>();
            while (input.hasNext()) {
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
                for (int l = 0; l < str.get(i).length; l++) {
                    int pox = Integer.parseInt(str.get(i).split(",")[0]);
                    int poy = Integer.parseInt(str.get(i).split(",")[1]);
                    strs[pox][poy] = "#";
                }
            }
            int px = 0;
            int py = 0;
            // for (int i = 0; i < strs.length(); i++) for (int l = 0; l < strs[0].length; l++) if (mat[i][l].equals("S")) px = i; py = l;
            
            System.out.println(bread(px, py, strs);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
