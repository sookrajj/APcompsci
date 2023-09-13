import java.util.*;

public class Prog88A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Math.random() * (max - min) + min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 2;

        int sum = num1 + num2;
        int dif = num1 - num2;
        int abs = Math.abs(dif);
        double ave = (num1 + num2) / 2;
        double pro = num1 * num2;
        int max, min;

        if (num1 > num2) {
             max = num1;
        } else {
            max = num2;
        }


        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);

        System.out.println("Sum = " + sum + " Difference = " + dif + " product = " + pro);
        System.out.println("Average = " + ave + " Absolute value " + abs);
        System.out.println("Maximum = " + max + " Minimum " + min);
    }
}

//Original numbers are 2 and 4
//Sum = 6 Difference = -2 product = 8.0
//Average = 3.0 Absolute value 2
//Maximum = 4 Minimum 2