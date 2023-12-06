package Q2.prog214ccl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog214m {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<String> list = new ArrayList<>();
            String type;
            double gallons;
            String wash;


            while (s.hasNext()) {
                type = s.next();
                gallons = s.nextDouble();
                wash = s.next();

                prog214cl hi = new prog214cl(type, gallons, wash);
                hi.calc();
                list.add(hi.toString());
            }

            System.out.println(list);

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//COMPSCI PETROLEUM COMPANY
//--------------------------------
//Premium			15.0gallons @ 1.479
//--------------------------------
//Gasoline			22.185000000000002
//Wash N				0.0
//
//				------
//
//Total Due		   22.185000000000002
//--------------------------------
//
//
//, COMPSCI PETROLEUM COMPANY
//--------------------------------
//Regular			21.4gallons @ 1.359
//--------------------------------
//Gasoline			24.326099999999997
//Wash Y			0.4200000000000004
//
//				------
//
//Total Due		   24.7461
//--------------------------------