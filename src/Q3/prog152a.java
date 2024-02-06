package Q3;

import java.util.Scanner;

public class prog152a {
    public static int re(int start, int end, int mult) {
        if (start == end) return start;
        return start + re(start+mult, end, mult);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter multiple");
        int start = s.nextInt();
        int multi = start;
        System.out.print("\nEnter end (has to be multiple of the multiple)\n");
        int end = s.nextInt();
        System.out.println("The sum of " + start + " to " + end + " is " + re(start, end, multi));
    }
}
//Enter multiple3
//
//Enter end (has to be multiple of the multiple)
//9669
//The sum of 3 to 9669 is 15586428