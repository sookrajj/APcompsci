import java.util.*;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter package weight in kilograms: ");
        double d = input.nextDouble();
        System.out.println("Enter package length in centimeters: ");
        double p = input.nextDouble();
        System.out.println("Enter package width in centimeters: ");
        double l = input.nextDouble();
        System.out.println("Enter package height in centimeters: ");
        double e = input.nextDouble();
        double w = p * l * e;
        if (w > 100000) {
            if ( d > 27) {
                System.out.println("Too heavy and big");
            } else {
                System.out.println("Too big");
            }
        } else {
            if (d > 27) {
                System.out.println("Too heavy");
            } else {
                System.out.println("You're good");
            }
        }
         
    }
}
//Enter package weight in kilograms:
//32
//Enter package length in centimeters:
//10
//Enter package width in centimeters:
//25
//Enter package height in centimeters:
//38
//Too heavy