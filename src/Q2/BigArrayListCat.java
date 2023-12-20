package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numcats = s.nextInt();
            s.nextLine();

            ArrayList<cat> cats = new ArrayList<cat>();

            for (int lcv = 0; lcv < numcats; lcv++) {
                String name = s.nextLine();
                double weight = s.nextDouble();
                int age = s.nextInt();
                double cost = s.nextDouble();
                s.nextLine();
                cats.add(new cat(name, weight, age, cost));
            }

            System.out.println("1. All the cats: ");
            System.out.println("Name\tweight\tage\tcost");
            for (cat cat : cats) {
                System.out.printf("%s\t%.2f\t%d\t%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }
            System.out.println("2. Name of third cat is named: " + cats.get(2).getName());

            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight()-10);
            System.out.println("3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                    lcv--;
                }
            }


            cats.add(1, new cat("Angel", 3.6, 1, 25.99));

            cats.add(new cat("Gimpy", 14.3, 10, 29.99));

            System.out.println("7. Updated list");
            System.out.println("Name\tWeight\tAge\tCost");
            for (cat cat : cats) {
                System.out.printf("%s\t%.2f\t%d\t%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }

            cat third = cats.get(2);
            cats.set(2, new cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

            cat sec = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, sec);

            System.out.println("10. Updated Names");
            for (cat cat : cats) {
                System.out.printf("%s", cat.getName());
                System.out.println();
            }

            System.out.println("11. All cats over $26, cost: ");
            for (int catts = 0; catts < cats.size(); catts++) {
                cat cat = cats.get(catts);
                if (cat.getCost() < 26) {
                    cats.remove(catts);
                    catts -= 1;
                } else {
                    System.out.println(cat.getCost());
                }
            }


            System.out.println("12. Cats going on a diet: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                cat cat = cats.get(lcv);
                if (cat.getWeight() > 15) {

                    System.out.println(cat.getName() + "\t");

                }
            }


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//1. All the cats:
//Name	weight	age	cost
//Inky	15.69	2	35.79
//Panda	14.30	6	15.03
//Rascal	21.10	21	0.00
//Blacky	13.99	3	26.89
//Taffy	24.50	10	56.89
//Toby	17.20	10	37.57
//2. Name of third cat is named: Rascal
//3. The updated weight is: 7.199999999999999
//7. Updated list
//Name	Weight	Age	Cost
//Inky	15.69	2	35.79
//Angel	3.60	1	25.99
//Panda	14.30	6	15.03
//Blacky	13.99	3	26.89
//Taffy	24.50	10	56.89
//Toby	7.20	10	37.57
//Gimpy	14.30	10	29.99
//10. Updated Names
//Inky
//Blacky
//Sugar
//Angel
//Taffy
//Toby
//Gimpy
//Panda
//11. All cats over $26, cost:
//35.79
//26.89
//33.25
//56.89
//37.57
//29.99
//12. Cats going on a diet:
//Inky
//Sugar
//Taffy