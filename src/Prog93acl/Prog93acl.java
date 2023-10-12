package Prog93acl;
import java.util.*;

public class Prog93acl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kilowatts used: ");
        int kilowatts = input.nextInt();

        cl93a wow = new cl93a(kilowatts);
        wow.calc();

        String h = wow.toString();

        System.out.println(h);

    }
}
//Kilowatts used:
//993
//kilowatts per hour	993
// Base rate	47.167500000000004
// surcharge	4.71675
// City Tax	1.415025
// Total	53.299275
//After May 20th cost	55.431246