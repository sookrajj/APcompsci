import java.lang.Math;
import java.util.*;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an angle in degrees: ");
        int f = input.nextInt();
        double g = Math.toRadians(f);
        double p = Math.sin(g);
        double h = Math.cos(g);
        double j = Math.tan(g);
        System.out.println("Sine: " + p);
        System.out.println("Cosine: " + h);
        System.out.println("Tangent: " + j);
    }
}
//enter an angle in degrees:
//30
//Sine: 0.49999999999999994
//Cosine: 0.8660254037844387
//Tangent: 0.5773502691896257