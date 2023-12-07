package Q2.Prog215icl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog215i.dat"));
            int vehiclenum = 0;
            double miles = 0.0;
            double gallons = 0.0;
            double fleetAve = 0.0;
            int cnt = 0;
            int bestv = 0;
            int worstv = 0;
            ArrayList<String> list = new ArrayList<>();


            while (s.hasNext()) {
                vehiclenum = s.nextInt();
                if (vehiclenum != 0) {
                    miles = s.nextDouble();
                        gallons = s.nextDouble();
                        if (miles != 0.0) {
                            cnt++;
                        }
                        vehicle hi = new vehicle(vehiclenum, miles, gallons);
                        hi.calc();
                        list.add(hi.toString());
                        fleetAve = hi.getMyFleetAve();
                        bestv = hi.getBest();
                        worstv = hi.getWorst();

                }
            }
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (int lcv = 0; lcv < cnt; lcv++) {
                System.out.println(list.get(lcv));
            }
            System.out.println("\nMPG Statistics");
            System.out.println("Best:  \t\t\t" + bestv);
            System.out.println("Worst: \t\t\t" + worstv);
            System.out.println("Fleet Average: \t" + fleetAve);
            System.out.println("Number of Vehicles:   " + cnt);




        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
