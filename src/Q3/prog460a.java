package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prog460a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/sort.dat"));
            Scanner sy = new Scanner(System.in);
            int[] list = new int[60];
            int cnt = 0;

            while (s.hasNext()) {
                list[cnt] = s.nextInt();
                cnt++;
            }

            Arrays.sort(list);
            int num = 0;
            while (num != -1) {
                System.out.println("\nEnter a number: " );
                num = sy.nextInt();
//                int index = SearchAlgs.linearSearch(list, num);
                int no = SearchAlgs.binarySearch(list, num);
//                int my = SearchAlgs.binaryRecur(list, num, 0, list.length-1);

                if (no == -1) System.out.println("Your number is not in the list");
                else {
                    System.out.println("Your number is at index " + no);
                }
            }


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
