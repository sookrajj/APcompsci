import java.util.*;

public class Prog58B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int c = -6;
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double root = (-b + sqrt) / (2 * a);
        double Root = (-b + -sqrt) / (2 * a);

        System.out.println("root =" + root);
        System.out.println("root =" + Root);
    }
}
//root =-2.0
//root =-3.0

//root =1.0
//root =-2.0

//root =2.0
//root =-3.0