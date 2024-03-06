package Q3.GIGAFARM;

import Q2.ArrayListcl.ArrayListab;

import java.util.*;
import java.util.LinkedList;

public class GIGAFarm {
    private int[] numes = new int[4];
    private int[][] rids;
    private int firhor = 0;
    private int curind;
    private double[] coast = new double[5];
    private Map<Integer, GIGACow> cowies;
    private LinkedList<GIGAHorse> horse;
    private Set<GIGATurkey> turk;
    private GIGAPig[] Pigs;
    private Stack<Integer> myhay;
    private Queue<Integer> mycorn;
    private static int farmhealth;
    private static int morale;

    public GIGAFarm(GIGAPig[] pig, Map<Integer, GIGACow> cows, LinkedList<GIGAHorse> horse, Set<GIGATurkey> turks,
                    int[][] rides, Stack<Integer> hay, Queue<Integer> corn, int[] nums, double[] cost) {
         numes = nums;
         rids = rides;
         cowies = cows;
         turk = turks;
         Pigs = pig;
         firhor = 0;
         curind = firhor;
         coast = cost;
        this.horse = horse;
        myhay = hay;
        mycorn = corn;
        farmhealth = 0;
        morale = 100;
    }

    public int getCurind() {return curind;}
    public int getfirhor() {return firhor;}
    public Set<GIGATurkey> getTurk() {return turk;}
    public GIGAPig[] getPigs() {return Pigs;}

    public double getBc() {
        return coast[2];
    }

    public double getCc() {
        return coast[0];
    }

    public double getHc() {
        return coast[1];
    }
    public int[][]  getRids() {return rids;}
    public double getOc() {
        return coast[3];
    }

    public double getMilk() {
        return coast[4];
    }
    public Map<Integer, GIGACow> getCowies() {
        return cowies;
    }
    public LinkedList<GIGAHorse> getHorse() {
        return this.horse;
    }
    public int getCorn() {return mycorn.poll();}
    public Queue<Integer> qcorn() {return mycorn;}
    public  Stack<Integer> sthay() {return myhay;}
    public Stack<Integer> copyhay(Stack<Integer> hay) {
        myhay = hay;
        return myhay;
    }
    public void addCorn(int co) {
        mycorn.add(co);
    }
    public int getHay() {return myhay.pop();}
    public  Queue<Integer> copycorn(Queue<Integer> corn) {
        mycorn = corn;
        return mycorn;
    }
    public void addHay(int h) {
        myhay.push(h);
    }
    public int getBeans() {return numes[0];}
    public void addBeans(int b) {
        numes[0] += b;
    }
    public int getOats() {return numes[1];}
    public void addOats(int o) {
        numes[1] += o;
    }
    public void death(int die) {
        if (farmhealth > 0 && die < 0) farmhealth += die;
        else if (farmhealth < 100 && die > 0){
            farmhealth += die;
        }
    }
    public int farmHealth() {return farmhealth;}
    public void mor(int mor) {
        if (morale == 200) {
            if (mor < 0) morale += mor;
            else this.death(5);
        }
        else if (morale == 50) {
            if (mor > 0) morale += mor;
            else this.death(-10);
        } else {
            morale += mor;
        }
    }
    public int morale() {return morale;}
    public void feedanis() {
        int corn = 0;
        int hay = 0;
        int oats = 0;
        int beans = 0;
        for (int lcv = 1; lcv < cowies.size()+1; lcv++) {
            corn += cowies.get(lcv).getCorn();
            hay += cowies.get(lcv).getHay();
            oats += cowies.get(lcv).getOats();
            beans += cowies.get(lcv).getBeans();
        }
        for (GIGAHorse ho :  horse) {
            corn += ho.getCorn();
            hay += ho.getHay();
            oats += ho.getOats();
            beans += ho.getBeans();
        }
        for (GIGAPig pig : Pigs) {
            corn += pig.getCorn();
            hay += pig.getHay();
            oats += pig.getOats();
            beans += pig.getBeans();
        }
        for (GIGATurkey tu : turk) {
            corn += tu.getCorn();
            hay += tu.getHay();
            oats += tu.getOats();
            beans += tu.getBeans();
        }
        int temp = corn;
        Queue<Integer> te = new PriorityQueue<>();
        te = mycorn;
        while (corn > 0 || mycorn.isEmpty()) {
            int g = mycorn.poll();
            if (corn - g <= 0) {
                g -= corn;
                corn = 0;
                mycorn.add(g);
            } else {
                corn -= g;
            }
        }
        if (corn == 0) {
            System.out.println("You have enough corn");
        } else {
            mycorn = te;
            System.out.println("You need " + corn + " more corn");
        }

        temp = hay;
        Stack<Integer> pl = myhay;
        while (hay > 0 || myhay.empty()) {
            int g = myhay.pop();
            if (hay - g <= 0) {
                g -= hay;
                hay = 0;
                myhay.add(g);
            } else {
                hay -= g;
            }
        }
        if (hay == 0) {
            System.out.println("You have enough hay");
        } else {
            myhay = pl;
            System.out.println("You need " + hay + " more hay");
        }

        if (numes[0] > beans) {
            System.out.println("You have enough beans");
        } else {
            System.out.println("You need " + (beans-numes[0]) + " more beans");
        }

        if (numes[1] > oats) {
            System.out.println("You have enough oats");
        } else {
            System.out.println("You need " + (numes[1]-oats) + " more oats");
        }
    }

    public double profit() {
        double totcost = 0;
        double costforwhole = 0;
        double totincome = 0;
        double incomeforwhole = 0;
        double totprof = 0;
        double profitforwhole = 0;
        int total = 0;
        int totani = 0;
        int rideSpot = 0;

            for (int lcv = 0; lcv < Pigs.length; lcv++) {
                totani++;
                GIGAPig Pigs = this.getPigs()[lcv];
                totprof += Pigs.getProfit(this.getMilk(), this.getCc(), this.getHc(), this.getBc(), this.getOc());
            }

            for (int lcv = 1; lcv < this.getCowies().size() + 1; lcv++) {
                totani++;
                totprof += this.getCowies().get(lcv).getProfit(this.getMilk(), this.getCc(), this.getHc(), this.getBc(), this.getOc());
            }

            totani -= 2;

            int[][] hi = this.getRids();
            totani += this.getHorse().size();
            for (int ll = 0; ll < hi.length; ll++) {

                for (int lcv = 0; lcv < hi[0].length; lcv++) {
                    for (int lc = 0; lc < hi[ll][lcv]; lc++) {
                        totprof += horse.get(rideSpot).getProfit(this.getMilk(), this.getCc(), this.getHc(), this.getBc(), this.getOc());
                        rideSpot++;
                        if (rideSpot == horse.size()) rideSpot = 0;
                    }
                }


            }


            totani += turk.size();
            Iterator<GIGATurkey> itr = turk.iterator();
            while (itr.hasNext()) {

                GIGATurkey gay = itr.next();
                totprof += gay.getProfit(this.getMilk(), this.getCc(), this.getHc(), this.getBc(), this.getOc());
            }

        return totprof;
    }
}
