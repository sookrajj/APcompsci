package Prog52acl;
import java.util.*;

public class Prog52cl { //driver class (main)
    public static void main(String[] args) {
        //input section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();

        //calculation section
        cl52a wow = new cl52a(l, w);
        wow.calc(); // don't forget to call calc or set thing!

        int area = wow.getArea();
        int perim = wow.getPerim();

        //output section
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perim);
    }
}
