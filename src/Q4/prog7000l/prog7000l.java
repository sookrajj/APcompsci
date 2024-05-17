package Q4.prog7000l;

import java.util.*;
import java.io.*;

public class prog7000l {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog7000l.csv"));
            ArrayList<Double[]> x = new ArrayList<>();
            ArrayList<Double> y = new ArrayList<>();
            // Home,Price,SqFt,Bedrooms,Bathrooms,Offers,Brick,Neighborhood
            input.nextLine();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] data = line.split(",");
                Double[] row = {
                        Double.parseDouble(data[2]),
                        Double.parseDouble(data[0]),
                };
                y.add(Double.parseDouble(data[1]));
                x.add(row);
            }
            var X_train = new double[x.size()][2];
            for (int i = 0; i < x.size(); i++) {
                X_train[i][0] = x.get(i)[0];
                X_train[i][1] = x.get(i)[1];
            }
            double[] Y_train = new double[y.size()];
            for (int i = 0; i < x.size(); i++) {
                Y_train[i] = y.get(i);
            }
            var lr = new LinearRegression(60, 100,
                    0.0000001, 0.00001);
            lr.fit(X_train, Y_train, 100);
            System.out.println(lr);

            double sqfoot = 1897;
            double closestpoint = X_train[0][0];
            int closestind = 0;
            for (int i = 1; i < X_train.length; i++){
                if (Math.abs(X_train[i][0]-sqfoot) < Math.abs(closestpoint-sqfoot)) {
                    closestpoint = X_train[i][0];
                    closestind = i;
                }
            }
            System.out.println("Predicted output for " + sqfoot + ": " + lr.predict(sqfoot));
            System.out.println("Compared to " + closestpoint + ": " + Y_train[closestind]);


        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Regression line: y = 65.18901820755923 * x + 100.00145793425986
//Objective: [1.1025E8, 2.3184176560075453E8, 3.2541984952843404E8, 3.88629012474549E8, 4.289115049118174E8, 4.538297777747661E8, 4.689947025623149E8, 4.781389257405022E8, 4.8362332708624226E8, 4.869023988271489E8, 4.888593075234886E8, 4.9002589037359226E8, 4.907208812343253E8, 4.911347621399432E8, 4.913811800662001E8, 4.9152787330965245E8, 4.916151931224106E8, 4.9166716813787645E8, 4.9169810413593054E8, 4.917165172158825E8, 4.917274765633302E8, 4.9173399946653134E8, 4.9173788183390343E8, 4.917401925846698E8, 4.91741567930474E8, 4.9174238653701955E8, 4.9174287378095835E8, 4.917431638031334E8, 4.917433364420943E8, 4.917434392164824E8, 4.917435004086145E8, 4.9174353685167444E8, 4.9174355856449234E8, 4.917435715101145E8, 4.917435792376443E8, 4.9174358385945314E8, 4.9174358663278884E8, 4.917435883059416E8, 4.9174358932428443E8, 4.917435899528955E8, 4.917435903495459E8, 4.91743590608134E8, 4.917435907845515E8, 4.9174359091206557E8, 4.917435910104675E8, 4.917435910915448E8, 4.917435911623127E8, 4.917435912269416E8, 4.917435912879177E8, 4.917435913467201E8, 4.9174359140422785E8, 4.917435914609676E8, 4.9174359151724654E8, 4.917435915732544E8, 4.917435916290971E8, 4.917435916848455E8, 4.9174359174053586E8, 4.9174359179619396E8, 4.917435918518288E8, 4.9174359190745205E8, 4.9174359196306884E8, 4.917435920186817E8, 4.9174359207429206E8, 4.917435921298985E8, 4.917435921855063E8, 4.917435922411127E8, 4.917435922967192E8, 4.917435923523256E8, 4.917435924079308E8, 4.9174359246353596E8, 4.917435925191424E8, 4.917435925747489E8, 4.9174359263035274E8, 4.917435926859605E8, 4.917435927415669E8, 4.917435927971734E8, 4.9174359285277855E8, 4.917435929083837E8, 4.9174359296399015E8, 4.917435930195953E8, 4.9174359307520175E8, 4.9174359313080823E8, 4.917435931864134E8, 4.917435932420185E8, 4.917435932976263E8, 4.9174359335323274E8, 4.917435934088379E8, 4.917435934644431E8, 4.917435935200495E8, 4.91743593575656E8, 4.917435936312611E8, 4.917435936868663E8, 4.9174359374247277E8, 4.9174359379807794E8, 4.9174359385368437E8, 4.9174359390929085E8, 4.9174359396489596E8, 4.9174359402050114E8, 4.917435940761076E8, 4.9174359413171405E8]
//Min. Objective: 1.1025E8
//Predicted output for 1897.0: 123763.56899767411
//Compared to 1900.0: 106900.0