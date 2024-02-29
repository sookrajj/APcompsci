package Q3.GIGAFARM;

import Q2.ArrayListcl.ArrayListab;

import java.util.ArrayList;

public class GIGAFarm {

    private ArrayList<GIGAAnimals> anis;
    private int numco;
    private int numha;
    private int numbe;
    private int numoa;
    private int[][] rids;
    private int firhor = 0;
    private int curind;
    private double cc;
    private double hc;
    private double bc;
    private double oc;
    private double milk;

    public GIGAFarm(ArrayList<GIGAAnimals> animals, int[][] rides, int numCorn, int numHay, int numBeans,
                    int numOats, double cornCost, double hayCost, double beanCost, double oatCost, double milkCost) {
         anis = animals;
         numco = numCorn;
         numha = numHay;
         numbe = numBeans;
         numoa = numOats;
         rids = rides;
         for (int lcv = 0; lcv < animals.size(); lcv++) {
             if (animals.get(lcv) instanceof GIGAHorse && firhor == 0) {
                 firhor = lcv;
             }
         }
         curind = firhor;
         cc = cornCost;
         hc = hayCost;
         bc = beanCost;
         oc = oatCost;
         milk = milkCost;
    }

    public int getCurind() {return curind;}
    public int getfirhor() {return firhor;}
    public ArrayList<GIGAAnimals> getAnis() {return anis;}

    public double getBc() {
        return bc;
    }

    public double getCc() {
        return cc;
    }

    public double getHc() {
        return hc;
    }

    public double getOc() {
        return oc;
    }

    public double getMilk() {
        return milk;
    }
}
