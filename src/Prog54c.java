import java.util.*;

public class Prog54c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = 3.712;
                double pi = 3.1415926;
                double Circumference = radius * 2 * pi;
                double Area = radius * radius * pi;
                double circumference = Math.round(Circumference * 100.0) / 100.0;
                double area = Math.round(Area * 100.0) / 100.0;

                System.out.println("Radius=" + radius);
                System.out.println("Circumference =" + circumference);
                System.out.println("Area=" + area);
    }
}
//Radius=3.712
//Circumference =23.32
//Area=43.29
