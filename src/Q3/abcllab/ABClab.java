package Q3.abcllab;

import java.util.Scanner;

public class ABClab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        //Circle
        System.out.println("Enter circle radius: ");
        double r = kbd.nextDouble();
        shape sh1 = new circle(r);

        System.out.println("Enter height: ");
        double rh = kbd.nextDouble();
        System.out.println("Enter width: ");
        double rw = kbd.nextDouble();
        shape sh2 = new rectangle(rh, rw);

        System.out.println("Enter Triangle height: ");
        double th = kbd.nextDouble();
        System.out.println("Enter Triangle base: ");
        double tb = kbd.nextDouble();
        shape sh3 = new triangle(th, tb);

        ((circle)sh1).printclass();
        sh1.calculatearea();
        sh1.calculatecircumference();
        ((rectangle)sh2).printclass();
        sh2.calculatearea();
        ((rectangle) sh2).calcperim();
        ((triangle)sh3).printclass();
        sh3.calculatearea();
        ((triangle) sh3).calcperim();

    }
}
