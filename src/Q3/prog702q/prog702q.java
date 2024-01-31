package Q3.prog702q;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog702q {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog702q.txt"));

            String name = "";
            int tires = 0;
            double value = 0;
            ArrayList<vehicles> list = new ArrayList<>();


            while (s.hasNext()) {
              int num = s.nextInt();
              if (num == 1) {
                 name = s.next();
                 tires = s.nextInt();
                 value = (double) s.nextInt();
                 list.add(new cars(name, tires, value));
              } else if (num == 2) {
                  name = s.next();
                  tires = s.nextInt();
                  value = 50000;
                  double miles = (double) s.nextInt();
                  list.add(new truck(name, tires, value, miles));
              } else {

                  name = s.next();
                  tires = s.nextInt();
                  value = 50000;
                  String word = s.next();
                  list.add(new bus(name, tires, value, word));
              }
            }
            System.out.println("Total amount of vehicles is: " + list.size());

            double carsvalue = 0;
            double allvalue = 0;
            int alltires = 0;
            double leastvaltruck = 1000000;
            String homelong = "";
            for (vehicles v : list) {
                if (v instanceof cars) {
                    carsvalue += v.getValue();
                    allvalue += v.getValue();
                } else if (v instanceof truck) {
                    allvalue += v.getValue() - ((truck) v).getmileage()*0.25;
                    if (leastvaltruck > v.getValue() - ((truck) v).getmileage()*0.25) {
                        leastvaltruck = v.getValue() - ((truck) v).getmileage()*0.25;
                    }
                } else if (v instanceof bus) {
                    allvalue += v.getValue();
                    if (homelong.length() < ((bus)v).getHome().length()) {
                        homelong = ((bus) v).getHome();
                    }
                }
                alltires += v.getTires();
            }

            System.out.println("The total cost of all vehicles is: " + allvalue);
            System.out.println("The total cost of all cars is: " + carsvalue);
            System.out.println("The longest home destination name is: " + homelong);

            System.out.println("Least valuable truck is: " + leastvaltruck);
            System.out.println("The total tires amount is: " + alltires);



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Total amount of vehicles is: 13
//The total cost of all vehicles is: 428199.75
//The total cost of all cars is: 33950.0
//The longest home destination name is: Minneapolis
//Least valuable truck is: 18750.0
//The total tires amount is: 179