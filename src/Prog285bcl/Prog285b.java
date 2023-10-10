package Prog285bcl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog285b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));

            System.out.println("Id\tCode\tSales\tCommission");
            while (input.hasNext()) {
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();

                Salesperson fred = new Salesperson(id, c, s);
                fred.setcom();
                System.out.println(fred.toString()); // println(fred)
            }
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }

    }
}
