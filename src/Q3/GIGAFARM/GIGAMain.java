package Q3.GIGAFARM;

import java.util.*;
import java.util.LinkedList;
import java.util.random.RandomGenerator;

public class GIGAMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<GIGAFarm> farms = new ArrayList<GIGAFarm>();
        LinkedList<GIGAHorse> horse = new LinkedList<GIGAHorse>();
        LinkedList<GIGAHorse> horses = new LinkedList<GIGAHorse>();
        LinkedList<GIGAHorse> horsies = new LinkedList<GIGAHorse>();
        LinkedList<GIGAHorse> horse3 = new LinkedList<GIGAHorse>();
        LinkedList<GIGAHorse> horses4 = new LinkedList<GIGAHorse>();
        LinkedList<GIGAHorse> horsies5 = new LinkedList<GIGAHorse>();
        Map<Integer, GIGACow> cows = new HashMap<Integer, GIGACow>();
        Map<Integer, GIGACow> cowwows = new HashMap<Integer, GIGACow>();
        Set<GIGATurkey> turks = new HashSet<GIGATurkey>();
        Set<GIGATurkey> turkeys = new HashSet<GIGATurkey>();
        Set<GIGATurkey> turks1 = new HashSet<GIGATurkey>();
        Set<GIGATurkey> turkeys2 = new HashSet<GIGATurkey>();
        Set<GIGATurkey> turks3 = new HashSet<GIGATurkey>();
        Set<GIGATurkey> turkeys4 = new HashSet<GIGATurkey>();
        Stack<Integer> hayStack = new Stack<>();
        Queue<Integer> cornQue = new PriorityQueue<>();
        double[] costs = new double[5];
        int[] nums = new int[2];
        int corn = 0;
        int hay = 0;
        int beans = 0;
        int oats = 0;

        for (int lc = 0; lc < 5; lc++) {

            int cow = 1;
            int ty = (int) Math.round(Math.random() * 3) + 12;

            for (int lcv = 0; lcv < ty; lcv++) {

                corn = (int) Math.round(Math.random() * 3) + 5;
               hay = (int) Math.round(Math.random() * 2) + 1;
               beans = (int) Math.round(Math.random() * 3) + 2;
               oats = (int) Math.round(Math.random() * 3) + 1;
               cows.put(cow, new GIGACow(corn, hay, beans, oats));
               cow++;
            }

            int h = (int) Math.round(Math.random() * 10) + 10;
            for (int lcv = 0; lcv < h; lcv++) {
                corn = (int) Math.round(Math.random() * 2) + 1;
                hay = 0;
                beans = 0;
                oats = (int) Math.round(Math.random() * 2) + 2;
                turks.add(new GIGATurkey(corn, hay, beans, oats));
            }
            int hor = (int) Math.round(Math.random() * 2) + 8;

            for (int lcv = 0; lcv < hor; lcv++) {
                corn = (int) Math.round(Math.random() * 2) + 2;
                hay = (int) Math.round(Math.random() * 2) + 1;
                beans = (int) Math.round(Math.random() * 3) + 2;
                oats = (int) Math.round(Math.random() * 3) + 1;
                horse.add(new GIGAHorse(corn, hay, beans, oats));
            }
            int pi = (int) Math.round(Math.random() * 8) + 12;

            GIGAPig[] pig = new GIGAPig[pi];
            GIGAPig[] piggie = new GIGAPig[pi];
            for (int lcv = 0; lcv < pig.length; lcv++) {
                corn = (int) Math.round(Math.random() * 5) + 3;
                hay = (int) Math.round(Math.random() * 1) + 1;
                beans = (int) Math.round(Math.random() * 4) + 2;
                oats = (int) Math.round(Math.random() * 3) + 3;
                pig[lcv] = new GIGAPig(corn, hay, beans, oats);
            }
            cornQue.add((int) Math.round(Math.random() * 5000) + 10000);
            hayStack.push((int) Math.round(Math.random() * 1000) + 2000);
            nums[0] = (int) Math.round(Math.random() * 250) + 500;
            nums[1] = (int) Math.round(Math.random() * 750) + 1750;
            int[][] rides = new int[3][7];
            for (int lcv = 0; lcv < rides.length; lcv++)  {
                for (int l = 0; l < rides[0].length; l++) {
                    if (l == 0) rides[lcv][l] = (int) Math.round(Math.random() * 4) + 3;
                    if (l == 6) rides[lcv][l] = (int) Math.round(Math.random() * 4) + 3;
                    rides[lcv][l] =  (int) Math.round(Math.random() * 4) + 1;
                }
            }

            costs[0] = Math.round(Math.random() * .70*100)/100+ .5;
            costs[1] = Math.round(Math.random() * .70*100)/100 + 1;
            costs[2] = Math.round(Math.random() * .50*100)/100 + .5;
            costs[3] =  Math.round(Math.random() * .50*100)/100 + .5;
            costs[4] = Math.round(Math.random() * 0.04*100)/100 + .40;
            farms.add(new GIGAFarm(pig, cows, horse, turks, rides, hayStack, cornQue, nums, costs));

            if (lc == 0) {
                horse = horses;
                turks = turkeys;
            }
            else if (lc == 1) {
                horse = horsies;
                turks = turks1;
            }
            else if (lc == 2) {
                horse = horse3;
                turks = turkeys2;
            }
            else if (lc == 3) {
                horse = horses4;
                turks = turks3;
            }
            else {
                horse = horsies5;
                turks = turkeys4;
            }
            cows = cowwows;
            pig = piggie;

        }

        double totcost = 0;
        double costforwhole = 0;
        double totincome = 0;
        double incomeforwhole = 0;
        double totprof = 0;
        double profitforwhole = 0;
        int total = 0;
        int totani = 0;
        int rideSpot = 0;
        for (int l = 0; l < farms.size(); l++) {
            GIGAFarm farm = farms.get(l);

            for (int lcv = 0; lcv < farm.getPigs().length; lcv++) {
                totani++;
                GIGAPig Pigs = farm.getPigs()[lcv];
                totcost += Pigs.getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totincome += Pigs.getIncome(farm.getMilk());
                totprof += Pigs.getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }

            for (int lcv = 1; lcv < farm.getCowies().size()+1; lcv++) {
                totani++;
                totincome += farm.getCowies().get(lcv).getMilk() * farm.getMilk();
                totcost += farm.getCowies().get(lcv).getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totprof += farm.getCowies().get(lcv).getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }

            totani-= 2;

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

            turks = farm.getTurk();
            totani += turks.size();
            Iterator<GIGATurkey> itr = turks.iterator();
            while (itr.hasNext()) {

                GIGATurkey gay = itr.next();
                totincome += gay.getIncome(farm.getMilk());
                totcost += gay.getCost(farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
                totprof += gay.getProfit(farm.getMilk(), farm.getCc(), farm.getHc(), farm.getBc(), farm.getOc());
            }

            costforwhole += totcost;
            incomeforwhole += totincome;
            profitforwhole += totprof;
//            System.out.println("Farm " + (l+1));
//            System.out.printf("The cost is $%.2f", totcost);
//            System.out.println();
//            System.out.printf("The income is $%.2f", totincome);
//            System.out.println();
//            System.out.printf("The profit is $%.2f", totprof);
//            System.out.println();
//            System.out.println("Total animals this farm has is " + totani);
//            System.out.println();
            totcost = 0;
            totincome = 0;
            totprof = 0;
            total +=  totani;
            totani = 0;
        }
//        System.out.println("The entirety of the farm makes: ");
//        System.out.println("The cost is " + costforwhole);
//        System.out.println("The income is " + incomeforwhole);
//        System.out.println("The profit is " + profitforwhole);
//        System.out.print("Total animals across all farms is " + total);

        boolean yes = true;
        double  curmon = 100000;
        int[] ship = new int[10];
        int[] shay = new int[10];
        int[] soat = new int[10];
        int[] sean = new int[10];
        for (int lcv = 0; lcv < ship.length; lcv++) {
            ship[lcv] = 0;
            shay[lcv] = 0;
            soat[lcv] = 0;
            sean[lcv] = 0;
        }
        System.out.println("Hello, and welcome to GIGA farm");
        System.out.println("Games span 10 days. You can choose to continue. \nAnswer in y or n unless int is asked. " +
                "\nYou start with $100000 and a farm both given by your recent passed grandpa" +
                "\nYou can only buy shipments in the morning" +
                "\nIt is up to you as to what happens\nLet's start!");
        while (yes) {
            for (int lcv = 0; lcv < 10; lcv++) {

                System.out.println("Morning");
                System.out.println("Current money = $" + curmon);
                String choice = "";
                for (int l = 0; l < farms.size(); l++) {

                    System.out.println("This is farm " + (l+1));
                    System.out.println("Do you want to feed your animals?");
                    choice = input.next();
                    if (choice.equals("y")) {
                        farms.get(l).feedanis();
                        if (farms.get(l).farmHealth() > 0) {
                            farms.get(l).death(-10);
                        }
                    } else {
                        System.out.println("Menace");
                        farms.get(l).death(10);
                        if (farms.get(l).farmHealth() >= 100) {
                            System.out.println("All animals on this farm have died.\nYou have one less farm now");
                            farms.remove(l);
                            System.out.println("You mourn the losses that you caused, it is now evening.");
                            l += 10;
                        }
                    }
                    System.out.println("Do you want the animals to be able to roam free?");
                    choice = input.next();
                    if (choice.equals("y")) {
                        System.out.println("Yay!");
                        farms.get(l).mor(10);
                    } else {
                        System.out.println("boring");
                        farms.get(l).mor(-10);
                    }

                    System.out.println("Do you want to buy corn? Comes in shipments of 1000-1500. max of 10 shipments per day\n Always arrives the next day.");
                    choice = input.next();
                    if (choice.equals("y")) {
                        System.out.println("How many?");
                        int numship = input.nextInt();
                        while (numship > 10 ||  numship <= 0) {
                            System.out.println("input a valid number");
                            numship = input.nextInt();
                        }
                        for (int r = 0; r < numship; r++) {
                            ship[r] = (int) Math.round(Math.random() * 500) + 1000;
                            if (curmon >= ship[r] * farms.get(l).getCc()) {
                                curmon -= ship[r] * farms.get(l).getCc();
                                System.out.println("Current money = $" + curmon);
                            } else {
                                System.out.println("not enough money");
                            }
                        }
                    }

                    System.out.println("Would you like to buy some hay? you may buy up to 10 bundles a day as well.\nArrives next day");
                    choice = input.next();
                    if (choice.equals("y")) {
                        System.out.println("How many?");
                        int numshipdehay = input.nextInt();
                        while (numshipdehay > 10 ||  numshipdehay <= 0) {
                            System.out.println("input a valid number");
                            numshipdehay = input.nextInt();
                        }
                        for (int r = 0; r < numshipdehay; r++) {
                            shay[r] = (int) Math.round(Math.random() * 500) + 1000;
                            if (curmon >= shay[r] * farms.get(l).getHc()) {
                                farms.get(l).addHay(shay[r]);
                                curmon -= shay[r] * farms.get(l).getHc();
                                System.out.println("Current money = $" + curmon);
                            } else {
                                System.out.println("not enough money");
                            }
                        }
                    }

                    System.out.println("Would you like to buy some oats? you may buy up to 10 bundles a day.\nArrives next day");
                    choice = input.next();
                    if (choice.equals("y")) {
                        System.out.println("How many?");
                        int numshipdeoat = input.nextInt();
                        while (numshipdeoat > 10 ||  numshipdeoat <= 0) {
                            System.out.println("input a valid number");
                            numshipdeoat = input.nextInt();
                        }
                        for (int r = 0; r < numshipdeoat; r++) {
                            soat[r] = (int) Math.round(Math.random() * 500) + 1000;
                            if (curmon >= soat[r] * farms.get(l).getOc()) {
                                farms.get(l).addOats(soat[r]);
                                curmon -= soat[r] * farms.get(l).getOc();
                                System.out.println("Current money = $" + curmon);
                            }  else {
                                System.out.println("not enough money");
                            }
                        }
                    }
                    System.out.println("Would you like to buy some beans? you may buy up to 10 shipments.\nArrives next day");
                    choice = input.next();
                    if (choice.equals("y")) {
                        System.out.println("How many?");
                        int numshipdebeans = input.nextInt();
                        while (numshipdebeans > 10 ||  numshipdebeans <= 0) {
                            System.out.println("input a valid number");
                            numshipdebeans = input.nextInt();
                        }
                        for (int r = 0; r < numshipdebeans; r++) {
                            sean[r] = (int) Math.round(Math.random() * 500) + 1000;
                            if (curmon >= sean[r] * farms.get(l).getBc()) {
                                farms.get(l).addBeans(sean[r]);
                                curmon -= sean[r] * farms.get(l).getBc();
                                System.out.println("Current money = $" + curmon);
                            } else {
                                System.out.println("not enough money");
                            }
                        }
                    }

                }


                System.out.println("Evening");
                for (int l = 0; l < farms.size(); l++) {
                    System.out.println("This is farm " + (l+1));
                    System.out.println("Do you want to feed your animals?");
                    choice = input.next();
                    if (choice.equals("y")) {
                        farms.get(l).feedanis();
                        if (farms.get(l).farmHealth() > 0) {
                            farms.get(l).death(-10);
                        }
                    } else {
                        System.out.println("Menace");
                        farms.get(l).death(10);
                        if (farms.get(l).farmHealth() >= 100) {
                            System.out.println("All animals on this farm have died.\nYou have one less farm now");
                            farms.remove(l);
                            System.out.println("You mourn the losses that you caused, it is now the next day.");
                            l += 10;
                        }
                    }
                    System.out.println("Do you want the animals to be able to roam free?");
                    choice = input.next();
                    if (choice.equals("y")) {
                        System.out.println("Yay!");
                        farms.get(l).mor(10);
                    } else {
                        System.out.println("boring");
                        farms.get(l).mor(-10);
                    }
                    curmon += farms.get(l).profit() * (farms.get(l).morale()/100.0);
                    for (int lc = 0; lc < 10; lc++) {
                        if (ship[lc] != 0) {
                            farms.get(l).addCorn(ship[lc]);
                            ship[lc] = 0;
                        }
                        if (shay[lc] != 0) {
                            farms.get(l).addHay(shay[lc]);
                            shay[lc] = 0;
                        }

                        if (soat[lc] != 0) {
                            farms.get(l).addOats(soat[lc]);
                            soat[lc] = 0;
                        }
                        if (sean[lc] != 0) {
                            farms.get(l).addBeans(sean[lc]);
                            sean[lc] = 0;
                        }
                    }

                }
                System.out.println();
                for (int be = 0; be < farms.size(); be++) {
                    System.out.println("Farm " + (be+1));
                    cornQue = farms.get(be).qcorn();
                    int g = 0;
                    while (!cornQue.isEmpty()) {
                        g += cornQue.poll();
                    }
                    System.out.println("Corn left: " + g);
                    g = 0;
                    Stack<Integer> l = new Stack<>();
                    l = farms.get(be).sthay();
                    while (!l.empty()) {
                        g += l.pop();
                    }
                    System.out.println("Hay left: " + g);
                    System.out.println("Oats left: " + farms.get(be).getOats());
                    System.out.println("Beans left: " + farms.get(be).getBc());
                }
                System.out.println("The money you have is " + curmon);
                System.out.println();
            }



        }

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

// Best run yet
//Farm 1
//The cost is $3880.00
//The income is $8305.20
//The profit is $4425.20
//Total animals this farm has is 45
//
//Farm 2
//The cost is $4546.00
//The income is $10967.00
//The profit is $6421.00
//Total animals this farm has is 56
//
//Farm 3
//The cost is $4570.00
//The income is $13401.00
//The profit is $8831.00
//Total animals this farm has is 53
//
//Farm 4
//The cost is $4246.00
//The income is $8591.00
//The profit is $4345.00
//Total animals this farm has is 48
//
//Farm 5
//The cost is $4798.00
//The income is $11995.00
//The profit is $7197.00
//Total animals this farm has is 55
//
//Total animals across all farms is 257