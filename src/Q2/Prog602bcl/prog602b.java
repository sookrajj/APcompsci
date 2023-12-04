package Q2.Prog602bcl;
import Q2.prog410tacl.cl410t;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class prog602b {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog602b.dat"));
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();
            while (s.hasNext()) {
                int id = s.nextInt();
                double hours = s.nextDouble();
                int code = s.nextInt();

                InternetCustomer Fred = new InternetCustomer(id, hours, code);
                list.add(Fred);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCustomer me = list.get(lcv);
                me.setCharge();
            }

            System.out.println("Account #\t\tHours\t\tCode\t\tAmount Due");

            for (InternetCustomer me : list) {
                System.out.printf("%d\t\t\t%.2f\t\t%d\t\t\t%.2f\n", me.getAcc(), me.getHours(), me.getCode(), me.getCharge());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Account #		Hours		Code		Amount Due
//1825			3.25		0			200.00
//14063			17.06		1			661.80
//17185			7.93		1			396.50
//19111			12.00		2			700.00
//20045			5.00		1			250.00
//21352			5.84		0			242.00
//22841			27.90		2			1087.00
//23051			1.55		2			350.00
//29118			15.02		0			550.60
//
//Process finished with exit code 0