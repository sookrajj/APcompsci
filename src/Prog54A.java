import java.util.*;

public class Prog54A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("enter miles driven: ");
        int miles = keyboard.nextInt();

        System.out.print("enter gallons used: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("MPG used by " + model + " is " + mpg + "m/g");

    }
}
