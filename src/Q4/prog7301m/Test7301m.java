package Q4.prog7301m;

import java.util.ArrayList;

public class Test7301m {
    public static void main(String[] args) {
        final int N_CLASSES = 10;

        var Xte = new ArrayList<Double[]>();
        var yte = new ArrayList<Double[]>();
        Q4.prog7301m.Prog7301m.readAndEncodeCSV("Langdat/prog7301m_test.csv", N_CLASSES, Xte, yte);
        var model = MultiLayerPerceptron.loadModel("Langdat/prog7301m_model.ser");
        if (model == null) return;

        double[][] X_test = Q4.prog7301m.Prog7301m.toArray(Xte);
        double[][] Y_test = Q4.prog7301m.Prog7301m.toArray(yte);
        double accuracy = model.accuracy(X_test, Y_test);
        System.out.println("Final Accuract: " + accuracy);
    }
}
