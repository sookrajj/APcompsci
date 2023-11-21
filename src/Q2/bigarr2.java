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
            cats[1] = new cat("Angel", 3.6, 1, 25.99);
            numCats++;

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

            System.out.println("\n10. The current cat names are: ");
            for (cat temp3 : cats) {
                if (temp3 != null)
                    System.out.println(temp3.getName());

            }
            System.out.println();


            int i = 0;
           while (i < numCats) {
               if (cats[i].getCost() < 26) {
                   for (int j = i; j < numCats; j++) {
                       cats[j] = cats[j+1];

                   }
                   numCats--;
               } else i++;
           }
            System.out.println("\n11.Cats costing more than $26 cost: ");
           for (int lcv = 0; lcv < numCats; lcv++) System.out.print(cats[lcv].getCost() + " ");
            System.out.println();

            System.out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                cat cat = cats[lcv];
                if (cat.getWeight() > 15) {
                    System.out.println(cat.getName() + "\t");
                }
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//1. All the cats:
//Name	Weight	Age	Cost
//Inky	15.69	2	35.79
//Panda	14.3	6	15.03
//Rascal	21.1	21	0.0
//Blacky	13.99	3	26.89
//Taffy	24.5	10	56.89
//Toby	17.2	10	37.57
//
//2. Third cat's name is: Rascal
//3. Last cat's new weight is: 27.2
//
//7. The updated list is:
//Name	Weight	Age	Cost
//Inky	15.69	2	35.79
//Angle	3.6	1	25.99
//Panda	14.3	6	15.03
//Blacky	13.99	3	26.89
//Taffy	24.5	10	56.89
//Toby	27.2	10	37.57
//Gimpy	14.3	10	29.99
//
//10. The current cat names are:
//Inky
//Blacky
//Sugar
//Angle
//Taffy
//Toby
//Gimpy
//Panda
//
//
//11.Cats costing more than $26 cost:
//35.79 26.89 33.25 56.89 37.57 29.99
//
//12. The cats being put on a diet are:
//Inky
//Sugar
//Taffy
//Toby