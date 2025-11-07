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
                ArrayList<Integer> nums = new ArrayList<>();
                for (int i = 0; i < newline.length; i++) {
                    nums.add(Integer.parseInt(newline[i]));
                }
                int increasing = 0;
                int decreasing = 0;
                int tols = 0;
                for (int i = 0; i < nums.size()-1; i++) {
                    int n1 = nums.get(i);
                    int n2 = nums.get(i+1);
                    increasing += n1 < n2 ? 1 : 0;
                    decreasing += n1 > n2 ? 1 : 0;
                    // tols += n1 == n2 ? 1 : 0;
                    // System.out.println(increasing + " " + decreasing);
                }
                var boom = false;
                if (increasing > decreasing) {
                    // tols += decreasing > 0 ? decreasing : 0;
        
                    for (int i = 0; i < nums.size()-1; i++) {
                        int n1 = nums.get(i);
                        int n2 = nums.get(i+1);
                        // if ((n1 >= n2 || n1 - n2 < -3) && i+2 !=  nums.length) {
                        //     n2 = nums[i+2];
                        //     i++;
                        if (boom && (n1 - n2 < -3 || n1 - n2 >= 0)) {
                            tols = 10000; 
                            // System.out.println("hi");
                            break;
                        }
                        boom = boom || (n1 - n2 < -3 || n1 - n2 >= 0);
                        if (boom && (n1 - n2 < -3 || n1 - n2 >= 0)){
                            nums.remove(i+1);
                            i--;
                        } 
                        // } else if (n1 >= n2) {
                        //     break;
                        // }
                        // if (n1 - n2 < -3 || n1 - n2 >= 0) tols++;
                    }
                } else if (increasing < decreasing) {
                    // tols += increasing > 0 ? increasing : 0;
                    // var boom = false;
                    for (int i = 0; i < nums.size()-1; i++) {
                        int n1 = nums.get(i);
                        int n2 = nums.get(i+1);
                        // if (n1 <= n2 && i+2 !=  nums.length) {
                        //     n2 = nums[i+2];
                            // i++;
                        if (boom && (n1 - n2 > 3 || n1 - n2 <= 0)) {
                            // System.out.println("hi");
                            tols = 10000; 
                            break;
                        }
                        boom = boom || (n1 - n2 > 3 || n1 - n2 <= 0);
                        if (boom && (n1 - n2 < -3 || n1 - n2 >= 0)) {
                            nums.remove(i+1);
                            i--;
                        }
                        // } else if (n1 <= n2) {
                        //     break;
                        // }
                        // if (n1 - n2 > 3 || n1 - n2 <= 0) tols++;
                    }
                } else {tols += 3;}
                // System.out.println(boom);
                // if (count == 0) {
                //     for (int i = 0; i < nums.size(); i++) {
                //         System.out.print(nums.get(i));
                //     }
                //     System.out.println();
                // }
                count += tols < 2 ? 1 : 0;
                // count += boom ? 0 : 1;
                
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
