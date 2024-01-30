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
            for (vehicles v : list) {
                if (v instanceof cars) {
                    carsvalue += v.getValue();
                    allvalue += v.getValue();
                } else if (v instanceof truck) {
                    allvalue += v.getValue() - ((truck) v).getmileage()*0.25;
                }
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
