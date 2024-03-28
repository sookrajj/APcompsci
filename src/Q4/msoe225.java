package Q4;

import java.util.*;
public class msoe225 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        int h = 1;
        while (s.hasNextInt() && h != 0) {
            g += h;
            h = s.nextInt();

        }
        System.out.println(Math.ceil((g/100)));
    }
}
