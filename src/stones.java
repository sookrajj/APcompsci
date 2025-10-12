import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class stones {
    public static int counter = 0;
    public static LinkedList<Long> nums = new LinkedList<>();
    // public static Map<Integer, ArrayList<Integer>> nines = new HashMap<>();
    //px, py == 1
    public static void blink() {
        int size = nums.size();
        // ArrayList<Long> temp = (ArrayList<Long>)nums.clone();
        // nums.clear();
        int r = 0;
        for (int i = 0; i < size; i++) {
            long num = nums.removeFirst();
            // System.out.print(num + " ");
            if (num == 0) nums.addLast((long)1);
            else {
                
                int ex = 0;
                while (num / (long)Math.pow(10, ex) >= 1) ex++;
                if (ex%2 == 0) {
                    nums.addLast(num/(long) Math.pow(10, ex/2));
                    nums.addLast(num% (long) Math.pow(10, ex/2));
                } else {
                    nums.addLast(num * 2024);
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/stones.dat"));
            while (input.hasNext()) {
                var line = input.next();
                // nums.add(Long.parseLong(line));
                // System.out.println(nums.peek());
            }
            nums.add((long)0);
            long t = 0;
            // double[] l = {1.35, 1.4, 1.45};
            // System.out.println(i + " " + nums.size());
            
            for (int i = 0; i < 15; i++) {blink();}
            ArrayList<Long> temp = new ArrayList<>();
            for (int f = 0; f < nums.size(); f++) temp.add(nums.removeFirst());
            nums.clear();
            System.out.println(temp.size());
            for (int u = 0; u < temp.size(); u++) {
                nums.add(temp.get(u));
                for (int l = 0; l < 15; l++) {blink();}
                ArrayList<Long> tem = new ArrayList<>();
                for (int f = 0; f < nums.size(); f++) tem.add(nums.removeFirst());
                nums.clear();
                for (int y = 0; y < tem.size(); y++) {
                    nums.add(tem.get(y));
                    for (int p = 0; p< 15; p++) {blink();}
                    ArrayList<Long> temp3 = new ArrayList<>();
                    for (int f = 0; f < nums.size(); f++) temp3.add(nums.removeFirst());
                    nums.clear();
                    for (int w = 0; w < temp3.size(); w++) {
                        nums.add(temp3.get(w));
                        for (int p = 0; p< 15; p++) {blink();}
                        ArrayList<Long> te = new ArrayList<>();
                        for (int f = 0; f < nums.size(); f++) te.add(nums.removeFirst());
                        nums.clear();
                        for (int f = 0; f < te.size(); f++) {
                            nums.add(te.get(f));
                            for (int p = 0; p< 15; p++) {blink();}
                            t += nums.size();
                            nums.clear();
                        }
                        nums.clear();
                        // System.out.println(w + " " + t + " third");
                    }
                    nums.clear();
                    System.out.println(y + " " + t + " second");
                }
                System.out.println(u + " " + t);
                nums.clear();
            }

            
            System.out.println(t);

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   