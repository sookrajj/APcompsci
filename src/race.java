import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class race {
     public static int bread(int px, int py, String[][] mat) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(px*1000 + py);
        Queue<Integer> l = new Queue<>();
        while (!queue.isEmpty()) {
            Integer node = queue.dequeue();
            
            l.enqueue(node);
//            System.out.print(node.data + " ");
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
            String[][] strs = new String[str.size()][str.get(0).length()];
            for (int i = 0; i < str.size(); i++) {
                for (int l = 0; l < str.get(0).length(); l++) {
                    strs[i][l] = str.get(i).substring(l, l+1);

                }
            }
            int px = 0;
            int py = 0;
            for (int i = 0; i < strs.length(); i++) for (int l = 0; l < strs[0].length; l++) if (mat[i][l].equals("S")) px = i; py = l;
            
            System.out.println(bread(px, py, strs);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
