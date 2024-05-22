package Q4.prog7300p;

import java.util.Arrays;

public class prog7300p {
    public static void main(String[] args) {
        //And nueron
        double[][] X_train = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };
        double[] y_train = {0, 0, 0, 1};

        System.out.println("AND Neuron:");
        var model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        //Predict using the trained model
        double[] yp = model.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(model.getWeights()));
        System.out.println("Bias " + model.getBias());

        System.out.println("\n\n");

        //Not Dataset
        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{1, 0};

        var modnot = new Perceptron(0.01, 20);
        modnot.fit(X_train, y_train);

        //Predict using the trained model
        yp = modnot.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(modnot.getWeights()));
        System.out.println("Bias " + model.getBias());

        System.out.println("\n\n");

        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{0, 0, 0, 1};

        System.out.println("AND Neuron:");
        var modor = new Perceptron(0.1, 20);
        modor.fit(X_train, y_train);

        //Predict using the trained model
        yp = modor.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(modor.getWeights()));
        System.out.println("Bias " + model.getBias());
    }
}
