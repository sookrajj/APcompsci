package Lang213ecl;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Lang213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));
            int q = 0;
            int w = 0;
            int e = 0;
            int r = 0;
            int t = 0;
            double qt = 0;
            double wt = 0;
            double et = 0;
            double rt = 0;
            double tt = 0;
            while (input.hasNext()) {
                int fam = input.nextInt();

                cl213e wow = new cl213e(fam);
                wow.calc();

                q = wow.getq();
                w = wow.getw();
                e = wow.gete();
                r = wow.getr();
                t = wow.gett();
                qt = wow.getqt();
                wt = wow.getwt();
                et = wow.getet();
                rt = wow.getrt();
                tt = wow.gettt();

            }
            System.out.println("Age Group Distribution  Percentage" +
                    "\n<20\t" +q+"\t" +qt+"\n<20\t" +w+"\t" +wt+"\n<20\t" +e+"\t" +et+"\n<20\t" +r+"\t" +rt+"\n<20\t" +t+"\t" +tt);
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
