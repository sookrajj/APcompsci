package Lang213fcl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Lang213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(new File("Langdat/prog213f.dat"));

        while (input.hasNext()) {
            int kilosused = input.nextInt();

            cl213f wow = new cl213f(kilosused);
            wow.calc();

            if (kilosused > 10000) {
                double perk1 = wow.getPerkf();
                double perk2 = wow.getPerks();
                double perk3 = wow.getPerkl();
            }
        }
    }
}
