import java.util.*;

public class LP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount of copies you want: ");
        int f = input.nextInt();

        if (f < 100) {
            double j = f * 0.30;
            System.out.println("price per copy is: $" + 0.30);
            System.out.println("Total cost is: $" + j);
        } else if (f < 500) {
            double j = f * 0.28;
            System.out.println("price per copy is: $" + 0.28);
            System.out.println("Total cost is: $" + j);
        } else if (f<750) {
            double j = f * 0.27;
            System.out.println("price per copy is: $" + 0.27);
            System.out.println("Total cost is: $" + j);
        } else if (f < 1001) {
            double j = f * 0.26;
            System.out.println("price per copy is: $" + 0.26);
            System.out.println("Total cost is: $" + j);
        } else {
            double j = f * 0.25;
            System.out.println("price per copy is: $" + 0.25);
            System.out.println("Total cost is: $" + j);
        }
    }
}
//The amount of copies you want:
//1001
//price per copy is: $0.25
//Total cost is: $250.25