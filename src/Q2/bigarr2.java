package Q2;

import Q2.prog402a.cl402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class bigarr2 {
    public static void printcat(cat cat) {
        System.out.println(cat.getName() + "\t" +cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }




    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            cat[] cats = new cat[50];



            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv] = new cat(name, weight, age, cost);
            }

            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                printcat(cats[lcv]);
            }

            System.out.println("\n2. Third cat's name is: " + cats[2].getName());

            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. Last cat's new weight is: " + cats[numCats-1].getWeight());

            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal")) {
                    rascalIndex = lcv;
                }
            }
            for (int lcv = rascalIndex; lcv < numCats-1; lcv++) {
                cats[lcv] = cats[lcv + 1];
            }
            numCats--;

            //for(int lcv = numCats+1; lcv --> 1;)
            for (int lcv = numCats; lcv >1; lcv--) {
                cats[lcv] = cats[lcv-1];
            }
            cats[1] = new cat("Angle", 3.6, 1, 25.99);

            cats[numCats] = new cat("Gimpy", 14.3, 10, 29.99);
            numCats++;

            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (cat cat: cats) {
                if (cat != null) {
                    printcat(cat);
                }
            }

            cat temp = cats[2];
            cats[2] = new cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            cat temp2 = cats[1];
            cats[1] = cats[3];
            cats[3] = temp2;






        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
