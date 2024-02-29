package Q3.GIGAFARM;

import Q2.ArrayListcl.ArrayListab;

import java.util.ArrayList;
import java.util.Map;

public class GIGAFarm {

    private ArrayList<GIGAAnimals> anis;
    private int[] numes = new int[4];
    private int[][] rids;
    private int firhor = 0;
    private int curind;
    private double[] coast = new double[5];
    private Map<Integer, GIGACow> cowies;

    public GIGAFarm(ArrayList<GIGAAnimals> animals, Map<Integer, GIGACow> cows, int[][] rides, int[] nums, double[] cost) {
         anis = animals;
         numes = nums;
         rids = rides;
         cowies = cows;
         for (int lcv = 0; lcv < animals.size(); lcv++) {
             if (animals.get(lcv) instanceof GIGAHorse && firhor == 0) {
                 firhor = lcv;
             }
         }
         curind = firhor;
         coast = cost;
    }

    public int getCurind() {return curind;}
    public int getfirhor() {return firhor;}
    public ArrayList<GIGAAnimals> getAnis() {return anis;}

    public double getBc() {
        return coast[2];
    }

    public double getCc() {
        return coast[0];
    }

    public double getHc() {
        return coast[1];
    }

    public double getOc() {
        return coast[3];
    }

    public double getMilk() {
        return coast[4];
    }
    public Map<Integer, GIGACow> getCowies() {
        return cowies;
    }
    public int getCorn() {return numes[0];}
    public int getHay() {return numes[1];}
    public int getBeans() {return numes[2];}
    public int getOats() {return numes[3];}
}
