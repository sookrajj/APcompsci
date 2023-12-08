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
            double btem = 0.0;
            int bes = 0;
            double wtem = 100.0;
            int wors = 0;
            double gals = 0.0;
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
                    fleetAve += gallons;
                    gals += miles;
                    double MPG = hi.getMPG();
                    if (MPG > btem) {
                        btem = MPG;
                        bes = vehiclenum;
                    }
                    if (MPG < wtem) {
                        wtem = MPG;
                        wors = vehiclenum;
                    }
                }
            }
            fleetAve = (fleetAve/gals);
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (int lcv = 0; lcv < cnt+2; lcv++) {
                System.out.println(list.get(lcv));
            }
            System.out.println("\nMPG Statistics");
            System.out.println("Best:  \t\t\t" + bes);
            System.out.println("Worst: \t\t\t" + wors);
            System.out.println("Fleet Average: \t" + fleetAve);
            System.out.println("Number of Vehicles:   " + cnt);




        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Vehicle	Miles	Gallons	MPG
//1005	380.5	15.0	25.366666666666667
//
//1003	240.1	12.0	20.008333333333333
//1006	172.3	9.0	19.144444444444446
//1008	317.7	14.0	22.692857142857143
//
//1010	390.2	17.0	22.95294117647059
//1015	152.1	4.0	38.025
//1017	310.0	12.3	25.203252032520325
//1020	409.9	17.9	22.899441340782122
//
//MPG Statistics
//Best:  			1015
//Worst: 			1006
//Fleet Average: 	23.44664031620554
//Number of Vehicles:   8
//
//Process finished with exit code 0