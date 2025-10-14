import java.util.*;
import java.io.File;
import java.io.IOException;

public class nums22 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/muls.dat"));
            int count = 0;
            int num = 0;
            boolean on = true;
            while (input.hasNext()) {
                String line = input.nextLine();
                //System.out.println(line);
                String nums = "1234567890";
                for (int i = 0; i < line.length()-4; i++) {
                    System.out.println(line.substring(i, i+4));
                    if (line.substring(i, i+4).equals("do()")) on = true;
                    if (i < line.length()-7) if (line.substring(i, i+7).equals("don't()")) on = false;
                    if (on && line.substring(i, i+4).equals("mul(")) {

                        i += 4;
                        int n1 = 0;
                        while (nums.contains(line.substring(i, i+1))) {
                            n1 = n1 *10 + Integer.parseInt(line.substring(i, i+1));
                            i++;
                        }
                        // if (!line.substring(i, i+1).equals(",")) {
                        //     n1 = 0;
                        // }
                        i++;
                        int n2 = 0;
                        while (nums.contains(line.substring(i, i+1))) {
                            n2 = n2 *10 + Integer.parseInt(line.substring(i, i+1));
                            i++;
                        }
                        // System.out.println(line.substring(i, i+1).equals(")"));
                        if (line.substring(i, i+1).equals(")")) {
                            // System.out.println((n2 * n1));
                            num += n2 * n1;
                        }
                        i--;
                    }
                }
            }
             System.out.println(num);
                
                
            
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   