import java.util.*;
import java.io.File;
import java.io.IOException;

public class nums {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/nums.dat"));
            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] newline = line.split(" ");
                int[] nums = new int[newline.length];
                for (int i = 0; i < newline.length; i++) {
                    nums[i] = Integer.parseInt(newline[i]);
                }
                int increasing = 0;
                int decreasing = 0;
                int tols = 0;
                for (int i = 0; i < nums.length-1; i++) {
                    int n1 = nums[i];
                    int n2 = nums[i+1];
                    increasing += n1 < n2 ? 1 : 0;
                    decreasing += n1 > n2 ? 1 : 0;
                    // tols += n1 == n2 ? 1 : 0;
                    if (count == 1) System.out.println(increasing + " " + decreasing);
                }
                if (increasing > decreasing) {
                    // tols += decreasing > 0 ? decreasing : 0;
                    var boom = false;
                    for (int i = 0; i < nums.length-1; i++) {
                        int n1 = nums[i];
                        int n2 = nums[i+1];
                        // if ((n1 >= n2 || n1 - n2 < -3) && i+2 !=  nums.length) {
                        //     n2 = nums[i+2];
                        //     i++;
                        if (boom && (n1 - n2 < -3 || n1 - n2 >= 0)) {tols = 10000; break;}
                        boom = boom || (n1 - n2 < -3 || n1 - n2 >= 0);
                        // } else if (n1 >= n2) {
                        //     break;
                        // }
                        // if (n1 - n2 < -3 || n1 - n2 >= 0) tols++;
                    }
                } else if (increasing < decreasing) {
                    // tols += increasing > 0 ? increasing : 0;
                    var boom = false;
                    for (int i = 0; i < nums.length-1; i++) {
                        int n1 = nums[i];
                        int n2 = nums[i+1];
                        // if (n1 <= n2 && i+2 !=  nums.length) {
                        //     n2 = nums[i+2];
                            // i++;
                        if (boom && (n1 - n2 > 3 || n1 - n2 <= 0)) {tols = 10000; break;}
                        boom = boom || (n1 - n2 > 3 || n1 - n2 <= 0);
                        // } else if (n1 <= n2) {
                        //     break;
                        // }
                        // if (n1 - n2 > 3 || n1 - n2 <= 0) tols++;
                    }
                } else {tols += 3;}
                // if (count == 1) {System.out.println();System.out.print(tols + " ");}
                count += tols < 2 ? 1 : 0;
                // count += boom ? 0 : 1;
                
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
