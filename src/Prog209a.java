import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));
            int y = 0;
            int k = 0;
            int h = 0;

            while (input.hasNext()) {
                int u = input.nextInt();
                if (u >= 500) k++;
                else h++;
                if (u >= 0) y++;
                else y++;

            }
            System.out.println("The number of numbers less than 500 is " + h + "\nThe number of numbers greater than or equal to 500 is " + k + "\nThe total number of numbers is " + y);

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//The number of numbers less than 500 is 192
//The number of numbers greater than or equal to 500 is 208
//The total number of numbers is 400
//ignore
//String num = Integer.toString(n);
//            String opnum = "";
//            String next = "";
//            int u = n +1;
//            String h = "";
//            for (int lcv = 0; lcv < num.length();) {
//                opnum += num.substring(num.length()-lcv, num.length()-lcv-1);
//                lcv++;
//            }
//            if (opnum.equals(num)) return n;
//            else {
//                for(int y = 0; y < 100; y++) {
//                    next = Integer.toString(u);
//                    for(int d = 0; d < next.length();) {
//                        h += num.substring(num.length()-d, num.length()-d-1);
//                        d++;
//                    }
//                    if(h.equals(next)) return u;
//                    else u++;
//                }
//            }
//            return -1;