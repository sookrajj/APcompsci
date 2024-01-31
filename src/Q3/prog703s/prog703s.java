package Q3.prog703s;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog703s {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog703s.txt"));
            ArrayList<Computer> list = new ArrayList<>();
            String name = "";
            int type = 0;
            int number = 0;
            double value = 0;


            while (s.hasNext()) {
                type = s.nextInt();
                name = s.next();
                number = s.nextInt();
                value = s.nextDouble();
                if (type == 1) {
                    String color = s.next();
                    list.add(new Apple(name, number, value, color));
                } else if (type == 2) {
                    double ver = s.nextDouble();
                    list.add(new Windows(name, number, value, ver));
                } else if (type == 3) {
                    int code = s.nextInt();
                    list.add(new Linux(name, number, value, code));
                }

            }


            int green = 0;
            int gold = 0;
            double seven = 0;
            int endfive = 0;

            for (Computer v : list) {
                if (v instanceof Apple) {
                    if (((Apple)v).getColor().equals("Gold")) {
                        gold++;
                    } else if (((Apple)v).getColor().equals("Green")) green++;
                } else if (v instanceof Windows) {
                    if (((Windows)v).getVer() == 7.0) {
                        seven++;
                    }
                } else if (v instanceof Linux) {
                    if (((Linux)v).getCode()%10 == 5) endfive++;
                }
            }

            System.out.println("Amount of Apple machines with gold: " + gold + " and green: " + green);
            System.out.println("Amount of Windows computers on version 7.0 is: " + seven);
            System.out.println("Amount of Linux computers that's code ends in five is: " + endfive);


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Amount of Apple machines with gold: 0 and green: 1
//Amount of Windows computers on version 7.0 is: 2.0
//Amount of Linux computers that's code ends in five is: 4