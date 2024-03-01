package Q3.GIGAFARM;

import java.util.*;
import java.util.LinkedList;
import java.util.random.RandomGenerator;

public class GIGAMain {
    public static void main(String[] args) {
        ArrayList<GIGAFarm> farms = new ArrayList<GIGAFarm>();
        LinkedList<GIGAHorse> horse = new LinkedList<GIGAHorse>();
        LinkedList<GIGAHorse> horses = new LinkedList<GIGAHorse>();
        Map<Integer, GIGACow> cows = new HashMap<Integer, GIGACow>();
        Map<Integer, GIGACow> cowwows = new HashMap<Integer, GIGACow>();
        Set<GIGATurkey> turks = new HashSet<GIGATurkey>();
        Set<GIGATurkey> turkeys = new HashSet<GIGATurkey>();
        double[] costs = new double[5];
        int[] nums = new int[4];
        int corn = 0;
        int hay = 0;
        int beans = 0;
        int oats = 0;

        for (int lc = 0; lc < 5; lc++) {

            int cow = 1;
            int ty = (int) Math.round(Math.random() * 3) + 12;
            System.out.println(ty);
            for (int lcv = 0; lcv < ty; lcv++) {

                corn = (int) Math.round(Math.random() * 3) + 5;
               hay = (int) Math.round(Math.random() * 2) + 1;
               beans = (int) Math.round(Math.random() * 3) + 2;
               oats = (int) Math.round(Math.random() * 3) + 1;
               cows.put(cow, new GIGACow(corn, hay, beans, oats));
               cow++;
            }

            int h = (int) Math.round(Math.random() * 10) + 10;
            System.out.println(h);
            for (int lcv = 0; lcv < h; lcv++) {
                corn = (int) Math.round(Math.random() * 2) + 1;
                hay = 0;
                beans = 0;
                oats = (int) Math.round(Math.random() * 2) + 2;
                turks.add(new GIGATurkey(corn, hay, beans, oats));
            }
            int hor = (int) Math.round(Math.random() * 2) + 8;
            System.out.println(hor);
            for (int lcv = 0; lcv < hor; lcv++) {
                corn = (int) Math.round(Math.random() * 2) + 2;
                hay = (int) Math.round(Math.random() * 2) + 1;
                beans = (int) Math.round(Math.random() * 3) + 2;
                oats = (int) Math.round(Math.random() * 3) + 1;
                horse.add(new GIGAHorse(corn, hay, beans, oats));
            }
            int pi = (int) Math.round(Math.random() * 8) + 12;
            System.out.println(pi);
            GIGAPig[] pig = new GIGAPig[pi];
            GIGAPig[] piggie = new GIGAPig[pi];
            for (int lcv = 0; lcv < pig.length; lcv++) {
                corn = (int) Math.round(Math.random() * 5) + 3;
                hay = (int) Math.round(Math.random() * 1) + 1;
                beans = (int) Math.round(Math.random() * 4) + 2;
                oats = (int) Math.round(Math.random() * 3) + 3;
                pig[lcv] = new GIGAPig(corn, hay, beans, oats);
            }

            nums[0] = (int) Math.round(Math.random() * 5000) + 10000;
            nums[1]= (int) Math.round(Math.random() * 1000) + 2000;
            nums[2] = (int) Math.round(Math.random() * 250) + 500;
            nums[3] = (int) Math.round(Math.random() * 750) + 1750;
            int[][] rides = new int[3][7];
            for (int lcv = 0; lcv < rides.length; lcv++)  {
                for (int l = 0; l < rides[0].length; l++) {
                    if (l == 0) rides[lcv][l] = (int) Math.round(Math.random() * 4) + 3;
                    if (l == 6) rides[lcv][l] = (int) Math.round(Math.random() * 4) + 3;
                    rides[lcv][l] =  (int) Math.round(Math.random() * 4) + 1;
                }
            }

            costs[0] = Math.round(Math.random() * .70*100)/100+ 5;
            costs[1] = Math.round(Math.random() * .70*100)/100 + 10;
            costs[2] = Math.round(Math.random() * .50*100)/100 + 1;
            costs[3] =  Math.round(Math.random() * .50*100)/100 + 1;
            costs[4] = Math.round(Math.random() * 0.04*100)/100 + .40;
            farms.add(new GIGAFarm(pig, cows, horse, turks, rides, nums, costs));
            horses.clear();
            horse = horses;
            turks = turkeys;
            cows = cowwows;
            pig = piggie;
            System.out.println(horse);
            System.out.println(horses);
            System.out.println(farms.get(lc).getHorse());
        }

        double totcost = 0;
        double totincome = 0;
        double totprof = 0;
        int total = 0;
        int totani = 0;
        int rideSpot = 0;
        for (int l = 0; l < farms.size(); l++) {
            GIGAFarm farm = farms.get(l);
            System.out.println(farm);
            for (int lcv = 0; lcv < farm.getPigs().length; lcv++) {
                totani++;
                GIGAPig Pigs = farm.getPigs()[lcv];
                totcost += Pigs.getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totincome += Pigs.getIncome(farm.getMilk());
                totprof += Pigs.getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }
            System.out.println(farm.getPigs().length);
            for (int lcv = 1; lcv < farm.getCowies().size()+1; lcv++) {
                totani++;
                totincome += farm.getCowies().get(lcv).getMilk() * farm.getMilk();
                totcost += farm.getCowies().get(lcv).getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totprof += farm.getCowies().get(lcv).getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }
            totani-= 2;
            System.out.println(farm.getCowies().size()+1);
            int[][] hi = farm.getRids();
            totani += farm.getHorse().size();

            for (int ll = 0; ll < hi.length; ll++) {

                    for (int lcv = 0; lcv < hi[0].length; lcv++) {
                        for (int lc = 0; lc < hi[ll][lcv]; lc++) {
                            totincome += farm.getHorse().get(rideSpot).getIncome(farm.getMilk());
                            totcost += farm.getHorse().get(rideSpot).getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                            totprof += farm.getHorse().get(rideSpot).getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                            rideSpot++;
                            if (rideSpot == farm.getHorse().size()) rideSpot = 0;
                        }
                    }


            }
            System.out.println(farm.getHorse().size());
            turks = farm.getTurk();
            totani += turks.size();
            System.out.println(turks.size());
            Iterator<GIGATurkey> itr = turks.iterator();
            while (itr.hasNext()) {

                GIGATurkey gay = itr.next();
                totincome += gay.getIncome(farm.getMilk());
                totcost += gay.getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totprof += gay.getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }
            System.out.println("Farm " + (l+1));
            System.out.printf("The cost is $%.2f", totcost);
            System.out.println();
            System.out.printf("The income is $%.2f", totincome);
            System.out.println();
            System.out.printf("The profit is $%.2f", totprof);
            System.out.println();
            System.out.println("Total animals this farm has is " + totani);
            System.out.println();
            totcost = 0;
            totincome = 0;
            totprof = 0;
            total +=  totani;
            totani = 0;
        }
        System.out.print("Total animals across all farms is " + total);


    }
}
//Farm 1
//The cost is $2592.50
//The income is $22793.60
//The profit is $20201.10
//
//Farm 2
//The cost is $5185.00
//The income is $45587.20
//The profit is $40402.20
//
//Farm 3
//The cost is $7777.50
//The income is $68380.80
//The profit is $60603.30
//
//Farm 4
//The cost is $10370.00
//The income is $91174.40
//The profit is $80804.40
//
//Farm 5
//The cost is $12962.50
//The income is $113968.00
//The profit is $101005.50
//
//Total animals across all farms is 1265

//Farm 1
//The cost is $1750.60
//The income is $22705.20
//The profit is $20891.80
//Total animals across all farms is 195
//
//Farm 2
//The cost is $1750.60
//The income is $22705.20
//The profit is $20891.80
//Total animals across all farms is 390
//
//Farm 3
//The cost is $1750.60
//The income is $22705.20
//The profit is $20891.80
//Total animals across all farms is 585
//
//Farm 4
//The cost is $1750.60
//The income is $22705.20
//The profit is $20891.80
//Total animals across all farms is 780
//
//Farm 5
//The cost is $1750.60
//The income is $22705.20
//The profit is $20891.80
//Total animals across all farms is 975
//
//Total animals across all farms is 975

//Farm 1
//The cost is $1095.00
//The income is $526436.40
//The profit is $525341.40
//Total animals this farm hhas is 82
//
//Farm 2
//The cost is $1100.00
//The income is $525902.40
//The profit is $524802.40
//Total animals this farm hhas is 82
//
//Farm 3
//The cost is $1086.50
//The income is $525884.40
//The profit is $524797.90
//Total animals this farm hhas is 81
//
//Farm 4
//The cost is $1079.50
//The income is $524715.40
//The profit is $523635.90
//Total animals this farm hhas is 80
//
//Farm 5
//The cost is $1043.50
//The income is $524190.40
//The profit is $523146.90
//Total animals this farm hhas is 76
//
//Total animals across all farms is 401Disconnected from the target VM, address: '127.0.0.1:60244', transport: 'socket'