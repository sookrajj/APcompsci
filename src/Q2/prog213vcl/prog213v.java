package Q2.prog213vcl;

import Q2.prog410tacl.cl410t;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog213v {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<Transaction>();

            double balance = s.nextDouble();
            Bank wow = new Bank(balance);

            String code = s.next();
            while (!(code.equals("E"))) {
                double amount = s.nextDouble();
                Transaction superman = new Transaction(code, amount);
                list.add(superman);
                code = s.next();
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                wow.calc(list.get(lcv));
            }

            System.out.println("The final balance is: $" + wow.getAmount());


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//The final balance is: $219.15