import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class admul {
    public static long good(ArrayList<Long> nums, long target) {
        ArrayList<Long> iters = new ArrayList<>();
        iters.add(nums.get(0));
        for (int i = 1; i < nums.size(); i++) {
            var comp = iters.size();
            for (int l = 0; l < comp; l++) {
                iters.add(iters.get(0) + nums.get(i));
                iters.add(iters.get(0) * nums.get(i));
                int p = 0;
                for (int f = 0; f < 100; f++) if (nums.get(i) / Math.pow(10, f) >= 1) p++;
                iters.add(iters.get(0) * (long) Math.pow(10, p) + nums.get(i));
                iters.remove(0);
            }
        }
        if (iters.contains(target)) return target;
        return 0;
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/admul.dat"));
            long tot = 0;
            while (input.hasNext()) {
                var line = input.nextLine();
                String[] g = line.split(" ");
                ArrayList<Long> nums = new ArrayList<>();
                // System.out.println(line);
                long target = Long.parseLong(g[0].substring(0, g[0].length()-1));
                for (int i = 1; i < g.length; i++) {
                    nums.add(Long.parseLong(g[i]));
                }
                
                tot += good(nums, target);
            }
            System.out.println(tot);
            
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   