package Lang213fcl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Lang213 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));
            while (input.hasNext()) {
                int kilosused = input.nextInt();

                cl213f wow = new cl213f(kilosused);
                wow.calc();

                if (kilosused > 10000) {
                    double perk1 = wow.getPerkf();
                    double perk2 = wow.getPerks();
                    double perk3 = wow.getPerkl();
                    double perks1 = perk1 + perk2 + perk3;
                    System.out.println("Due: $" + perks1);
                } else if (kilosused > 2000) {
                    double perk1 = wow.getPerkf();
                    double perk2 = wow.getPerks();
                    double perk3 = wow.getPerkl();
                    double perks1 = perk1 + perk2 + perk3;
                    System.out.println("Due: $" + perks1);
                } else if (kilosused > 0) {
                    double perk1 = wow.getPerkf();
                    double perk2 = wow.getPerks();
                    double perk3 = wow.getPerkl();
                    double perks1 = perk1 + perk2 + perk3;
                    System.out.println("Due: $" + perks1);
                } else System.out.println("You're trying to steal our money aren't you.");
            }
        }catch(IOException e) {
            System.out.println("Couldn't find data file.");
        }


    }
}
//Due: $93.66000000000001
//Due: $521.55
//Due: $682.44
//You're trying to steal our money aren't you.