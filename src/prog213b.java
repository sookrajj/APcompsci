import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog213b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213b.dat"));

            System.out.println("Id\tCode\tSales\tCommission");
            while (input.hasNext()) {
                int amount = input.nextInt();

              if (money < 100) {
                double r = amount * 5.95;
                System.out.println("Enter quantity: " + amount + "\nPrice: " + 5.95 + "\nAmount due: " + r);
              }else if (money < 200) {
                double r = amount * 5.75;
                System.out.println("Enter quantity: " + amount + "\nPrice: " + 5.75 + "\nAmount due: " + r);
              }else if (money < 300) {
                double r = amount * 5.40;
                System.out.println("Enter quantity: " + amount + "\nPrice: " + 5.40 + "\nAmount due: " + r);
              } else {
                double r = amount * 5.15;
                System.out.println("Enter quantity: " + amount + "\nPrice: " + 5.15 + "\nAmount due: " + r);
              }
            }
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }

    }
}
