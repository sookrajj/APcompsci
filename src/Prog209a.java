import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));

            while (input.hasNext()) {
                int u = input.nextInt();
                int y = 0;
                int k = 0;
                int h = 0;
                if (u >= 500) k++;
                else h++;
                if (u >= 0) y++;
                else y++;
                System.out.println("The number of numbers less than 500 is " + h + "\nThe number of numbers greater than or equal to 500 is " + k + "\nThe total number of numbers is " + y);

            }
        } catch (IOException e) {
            System.out.println("Can't find data file.");
    }
}
