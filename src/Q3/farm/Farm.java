package Q3.farm;

import Q3.prog505t.cows;
import Q3.prog505t.horse;

import java.util.ArrayList;

public class Farm implements IFarrm {

        private static ArrayList<CowW> mycows = new ArrayList<CowW>();
        private static ArrayList<HorseW> gay = new ArrayList<HorseW>(); // horses as a joke
        private int mynumcows;
        private int mynumhorseys;
        private static int haycnt;
        private static int corncnt;
        private double corncost;
        private double haycost;
        private int cowfeedoncorn;
        private int cowfeedonhay;
        private int horseathay;
        private int horseatcorn;



        public Farm(ArrayList<CowW> allcows, ArrayList<HorseW> allhorses, int numcows, int numhorses, double cornsales, double haysales, int haybales, int corn) {
            mycows = allcows;
            gay = allhorses;
            mynumcows = numcows;
            mynumhorseys = numhorses;
            haycnt = haybales;
            corncnt = corn;
            corncost = cornsales;
            haycost = haysales;
            for (int lcv = 0; lcv < numcows; lcv++) {
                cowfeedoncorn += allcows.get(lcv).getnumCorn();
                cowfeedonhay += allcows.get(lcv).getnumHay();
            }
            for (int lcv = 0; lcv < numhorses; lcv++) {
                horseathay += allhorses.get(lcv).getnumHay();
                horseatcorn += allhorses.get(lcv).getnumCorn();
            }

        }

        private boolean feedcows() {
            if (haycnt > cowfeedonhay && corncnt > cowfeedoncorn) {
                haycnt -= cowfeedonhay;
                corncnt -= cowfeedoncorn;
                return true;
            }
            return false;
        }

        private boolean feedhorses() {
            if (haycnt > horseathay && corncnt > horseatcorn) {
                haycnt -= horseathay;
                corncnt -= horseatcorn;
                return true;
            }
            return false;
        }

        public boolean feedAllAnimals() {
            if (haycnt > horseathay+cowfeedonhay && corncnt > horseatcorn+cowfeedoncorn) {
                haycnt -= horseathay+cowfeedonhay;
                corncnt -= horseatcorn+cowfeedoncorn;
                return true;
            }
            return false;
        }


        public double cowIncome(double perPound) {
            double cowmilk = 0.0;

            for (int lcv = 0; lcv < mynumcows; lcv++) {
                cowmilk += mycows.get(lcv).value(corncost, haycost);
            }

            return cowmilk;

        }

        public double horseIncome() {
            double horseride = 0.0;
            for (int lcv = 0; lcv < mynumhorseys; lcv++) {
                horseride += gay.get(lcv).value(corncost, haycost);
            }
            return horseride;
        }

        public double farmIncome(double perPound) {
            double cowmilk = 0.0;

            for (int lcv = 0; lcv < mynumcows; lcv++) {
                cowmilk += mycows.get(lcv).value(corncost, haycost);
            }
            double horseride = 0.0;
            for (int lcv = 0; lcv < mynumhorseys; lcv++) {
                horseride += gay.get(lcv).value(corncost, haycost);
            }

            return cowmilk+ horseride;
        }

        public int getWeight() {
            int weight = 0;
            for (int lcv = 0; lcv < mynumcows; lcv++) {
                weight += mycows.get(lcv).getWeight();
            }
            for (int lcv = 0; lcv < mynumhorseys; lcv++) {
                weight += gay.get(lcv).getWeight();
            }
            return weight;
        }

        public double value(double cornCost, double hayCost) {
            return
        }

        public int gethaycnt() {return haycnt;}
        public int getcorncnt() {return corncnt;}

        public int getMoreHay() {return cowfeedonhay + horseathay - haycnt;}
        public int getMoreCorn() {return cowfeedoncorn + horseatcorn - corncnt;}




}
