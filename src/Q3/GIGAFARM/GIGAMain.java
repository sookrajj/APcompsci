package Q3.GIGAFARM;

import java.util.ArrayList;

public class GIGAMain {
    public static void main(String[] args) {
        ArrayList<GIGAAnimals> animals = new ArrayList<GIGAAnimals>();
        ArrayList<GIGAFarm> farms = new ArrayList<GIGAFarm>();
        int corn = 0;
        int hay = 0;
        int beans = 0;
        int oats = 0;

        for (int lc = 0; lc < 5; lc++) {

            for (int lcv = 0; lcv < (int) Math.round(Math.random() * 3) + 12; lcv++) {
                corn = (int) Math.round(Math.random() * 3) + 5;
               hay = (int) Math.round(Math.random() * 2) + 1;
               beans = (int) Math.round(Math.random() * 3) + 2;
               oats = (int) Math.round(Math.random() * 3) + 1;
               animals.add(new GIGACow(corn, hay, beans, oats));
            }

            for (int lcv = 0; lcv < (int) Math.round(Math.random() * 10) + 10; lcv++) {
                corn = (int) Math.round(Math.random() * 2) + 1;
                hay = 0;
                beans = 0;
                oats = (int) Math.round(Math.random() * 2) + 2;
                animals.add(new GIGAHorse(corn, hay, beans, oats));
            }

            for (int lcv = 0; lcv < (int) Math.round(Math.random() * 2) + 8; lcv++) {
                corn = (int) Math.round(Math.random() * 2) + 2;
                hay = (int) Math.round(Math.random() * 2) + 1;
                beans = (int) Math.round(Math.random() * 3) + 2;
                oats = (int) Math.round(Math.random() * 3) + 1;
                animals.add(new GIGACow(corn, hay, beans, oats));
            }

            for (int lcv = 0; lcv < (int) Math.round(Math.random() * 8) + 12; lcv++) {
                corn = (int) Math.round(Math.random() * 5) + 3;
                hay = (int) Math.round(Math.random() * 1) + 1;
                beans = (int) Math.round(Math.random() * 4) + 2;
                oats = (int) Math.round(Math.random() * 3) + 3;
                animals.add(new GIGAPig(corn, hay, beans, oats));
            }

            int numCorn = (int) Math.round(Math.random() * 5000) + 10000;
            int numHay = (int) Math.round(Math.random() * 1000) + 2000;
            int numBeans = (int) Math.round(Math.random() * 250) + 500;
            int numOats = (int) Math.round(Math.random() * 750) + 1750;
            int[][] rides = new int[3][7];
            for (int lcv = 0; lcv < rides.length; lcv++)  {
                for (int l = 0; l < rides[0].length; l++) {
                    if (l == 0) rides[lcv][l] = (int) Math.round(Math.random() * 4) + 3;
                    if (l == 6) rides[lcv][l] = (int) Math.round(Math.random() * 4) + 3;
                    rides[lcv][l] =  (int) Math.round(Math.random() * 4) + 1;
                }
            }

            double cornCost = Math.round(Math.random() * .70*100)/100+ 1;
            double hayCost = Math.round(Math.random() * .70*100)/100 + 2;
            double beanCost = Math.round(Math.random() * .50*100)/100 + 0.50;
            double oatCost =  Math.round(Math.random() * .50*100)/100 + 0.50;
            double milkCost = Math.round(Math.random() * 0.04*100)/100 + .20;
            farms.add(new GIGAFarm(animals, rides, numCorn, numHay, numBeans, numOats, cornCost,hayCost, beanCost, oatCost, milkCost));
        }
        double totcost = 0;
        double totincome = 0;
        double totprof = 0;
        int totani = 0;
        for (int l = 0; l < farms.size(); l++) {
            GIGAFarm farm = farms.get(l);
            for (int lcv = 0; lcv < farm.getAnis().size(); lcv++) {
                totani++;
                GIGAAnimals ani = farm.getAnis().get(lcv);
                totcost += ani.getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totincome += ani.getIncome(farm.getMilk());
                totprof += ani.getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }
            System.out.println("Farm " + l);
            System.out.printf("The cost is $%.2f", totcost);
            System.out.println();
            System.out.printf("The income is $%.2f", totincome);
            System.out.println();
            System.out.printf("The profit is $%.2f", totprof);
            System.out.println();
            System.out.println();
        }
        System.out.print("Total animals across all farms is " + totani);


    }
}
