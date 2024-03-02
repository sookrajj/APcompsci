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
    public int getHay() {return myhay.pop();}
    public int getBeans() {return numes[0];}
    public int getOats() {return numes[1];}
}
