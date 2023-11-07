package Q2.Prog214barray;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog214bmain {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.dat"));
            cl214b[] list = new cl214b[1000];
            int cnt = 0;

            while (input.hasNext()) {
              int emnum = input.nextInt();
              double ytd = input.nextDouble();
              double rate = input.nextDouble();
              double shfac = input.nextDouble();
              double hrs = input.nextDouble();


               if(emnum != -999) {
                   cl214b yikes = new cl214b(hrs, rate, shfac, ytd, emnum);
                   list[cnt] = yikes;
                   cnt++;
               }

            }
            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].calc();
            }
            for (int lcv =0; lcv < cnt; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Employee number: 1001
//Hours 34.5 Rate 4.5 Shift Factor 1.25
//		 Current 	 Year-to date
//Gross Pay 194.0625	1056.1
//Withholding 23.287499999999998
//Fica 11.74078125
//Net Pay 159.03421875
//Employee number: 1002
//Hours 25.0 Rate 3.25 Shift Factor 1.0
//		 Current 	 Year-to date
//Gross Pay 81.25	3970.0
//Withholding 0.0
//Fica 4.9156249999999995
//Net Pay 76.334375
//Employee number: 1003
//Hours 30.0 Rate 4.0 Shift Factor 1.0
//		 Current 	 Year-to date
//Gross Pay 120.0	12485.5
//Withholding 9.6
//Fica 7.26
//Net Pay 103.14
//Employee number: 1004
//Hours 38.5 Rate 5.25 Shift Factor 1.5
//		 Current 	 Year-to date
//Gross Pay 303.1875	15587.4
//Withholding 53.0578125
//Fica 18.34284375
//Net Pay 231.78684375
//Employee number: 1005
//Hours 40.0 Rate 6.25 Shift Factor 1.0
//		 Current 	 Year-to date
//Gross Pay 250.0	17188.5
//Withholding 37.5
//Fica 21.87075
//Net Pay 190.62925
//Employee number: 1006
//Hours 48.0 Rate 8.95 Shift Factor 1.5
//		 Current 	 Year-to date
//Gross Pay 644.4	19109.4
//Withholding 112.76999999999998
//Fica 0.0
//Net Pay 531.63
//Employee number: 1007
//Hours 35.0 Rate 5.0 Shift Factor 1.5
//		 Current 	 Year-to date
//Gross Pay 262.5	15600.0
//Withholding 39.375
//Fica 15.88125
//Net Pay 207.24375