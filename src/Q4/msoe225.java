package Q4;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class msoe225 {

    public static void main(String[] args) {

            Scanner sy = new Scanner(System.in);
            System.out.print("Enter number of sales: ");
            int num = sy.nextInt();
//            String path = sy.next();
//            Scanner s = new Scanner(new File(path));
            int g = 0;
            int h = 1;

        for (int lcv = 0; lcv < num; lcv++) {
                h = sy.nextInt();
                g += h;
            }
            System.out.println(Math.ceil((g / 100.0)));
    }
}
//Enter number of sales: 3
//100
//80
//50
//3.0