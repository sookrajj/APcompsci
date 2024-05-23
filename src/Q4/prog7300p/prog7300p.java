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

        System.out.println("Not Neuron");
        var modnot = new Perceptron(0.1, 15);
        modnot.fit(X_train, y_train);

        //Predict using the trained model
        yp = modnot.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(modnot.getWeights()));
        System.out.println("Bias " + modnot.getBias());

        System.out.println("\n\n");

        // Or Neuron
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{0, 1, 1, 1};

        System.out.println("Or Neuron");
        var modor = new Perceptron(0.1, 20);
        modor.fit(X_train, y_train);

        //Predict using the trained model
        yp = modor.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(modor.getWeights()));
        System.out.println("Bias " + modor.getBias());

        System.out.println("\n\n");

        // Nand neuron
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 1, 1, 0};

        System.out.println("Nand Neuron");
        var modnand = new Perceptron(0.1, 20);
        modnand.fit(X_train, y_train);

        //Predict using the trained model
        yp = modnand.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(modnand.getWeights()));
        System.out.println("Bias " + modnand.getBias());

        System.out.println("\n\n");

        // Nor Neuron
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 0, 0, 0};

        System.out.println("Nor Neuron");
        var modnor = new Perceptron(0.1, 20);
        modnor.fit(X_train, y_train);

        //Predict using the trained model
        yp = modnor.predict(X_train);
        System.out.println("Predicted " + Arrays.toString(yp));
        System.out.println("Actual " + Arrays.toString(y_train));

        // Weights and bias
        System.out.println("Weights " + Arrays.toString(modnor.getWeights()));
        System.out.println("Bias " + modnor.getBias());
    }
}
//AND Neuron:
//Epoch: 1 Loss: 0.0
//Epoch: 2 Loss: 0.0
//Epoch: 3 Loss: 0.25
//Epoch: 4 Loss: 0.25
//Epoch: 5 Loss: 0.25
//Epoch: 6 Loss: 0.25
//Epoch: 7 Loss: 0.25
//Epoch: 8 Loss: 0.25
//Epoch: 9 Loss: 0.0
//Epoch: 10 Loss: 0.0
//Epoch: 11 Loss: 0.0
//Epoch: 12 Loss: 0.0
//Epoch: 13 Loss: 0.0
//Epoch: 14 Loss: 0.0
//Epoch: 15 Loss: 0.0
//Predicted [0.0, 0.0, 0.0, 1.0]
//Actual [0.0, 0.0, 0.0, 1.0]
//Weights [0.19510367213745716, 0.073619889337241]
//Bias -0.19999999999999987
//
//Not Neuron
//Epoch: 1 Loss: 0.5
//Epoch: 2 Loss: 0.5
//Epoch: 3 Loss: 0.5
//Epoch: 4 Loss: 0.5
//Epoch: 5 Loss: 0.0
//Epoch: 6 Loss: 0.0
//Epoch: 7 Loss: 0.0
//Epoch: 8 Loss: 0.0
//Epoch: 9 Loss: 0.0
//Epoch: 10 Loss: 0.0
//Epoch: 11 Loss: 0.0
//Epoch: 12 Loss: 0.0
//Epoch: 13 Loss: 0.0
//Epoch: 14 Loss: 0.0
//Epoch: 15 Loss: 0.0
//Predicted [1.0, 0.0]
//Actual [1.0, 0.0]
//Weights [-0.7426134236614865]
//Bias 0.6000000000000001
//
//Or Neuron
//Epoch: 1 Loss: 0.0
//Epoch: 2 Loss: 0.0
//Epoch: 3 Loss: 0.0
//Epoch: 4 Loss: 0.0
//Epoch: 5 Loss: 0.0
//Epoch: 6 Loss: 0.0
//Epoch: 7 Loss: 0.0
//Epoch: 8 Loss: 0.0
//Epoch: 9 Loss: 0.0
//Epoch: 10 Loss: 0.0
//Epoch: 11 Loss: 0.0
//Epoch: 12 Loss: 0.0
//Epoch: 13 Loss: 0.0
//Epoch: 14 Loss: 0.0
//Epoch: 15 Loss: 0.0
//Epoch: 16 Loss: 0.0
//Epoch: 17 Loss: 0.0
//Epoch: 18 Loss: 0.0
//Epoch: 19 Loss: 0.0
//Epoch: 20 Loss: 0.0
//Predicted [0.0, 1.0, 1.0, 1.0]
//Actual [0.0, 1.0, 1.0, 1.0]
//Weights [0.4666688497925573, 0.14548659644352374]
//Bias -0.09999999999999987
//
//Nand Neuron
//Epoch: 1 Loss: 0.25
//Epoch: 2 Loss: 0.25
//Epoch: 3 Loss: 0.25
//Epoch: 4 Loss: 0.25
//Epoch: 5 Loss: 0.0
//Epoch: 6 Loss: 0.0
//Epoch: 7 Loss: 0.0
//Epoch: 8 Loss: 0.0
//Epoch: 9 Loss: 0.0
//Epoch: 10 Loss: 0.0
//Epoch: 11 Loss: 0.0
//Epoch: 12 Loss: 0.0
//Epoch: 13 Loss: 0.0
//Epoch: 14 Loss: 0.0
//Epoch: 15 Loss: 0.0
//Epoch: 16 Loss: 0.0
//Epoch: 17 Loss: 0.0
//Epoch: 18 Loss: 0.0
//Epoch: 19 Loss: 0.0
//Epoch: 20 Loss: 0.0
//Predicted [1.0, 1.0, 1.0, 0.0]
//Actual [1.0, 1.0, 1.0, 0.0]
//Weights [-0.4849641993361917, -0.30471409519888004]
//Bias 0.6000000000000001
//
//Nor Neuron
//Epoch: 1 Loss: 0.25
//Epoch: 2 Loss: 0.25
//Epoch: 3 Loss: 0.0
//Epoch: 4 Loss: 0.0
//Epoch: 5 Loss: 0.0
//Epoch: 6 Loss: 0.0
//Epoch: 7 Loss: 0.0
//Epoch: 8 Loss: 0.0
//Epoch: 9 Loss: 0.0
//Epoch: 10 Loss: 0.0
//Epoch: 11 Loss: 0.0
//Epoch: 12 Loss: 0.0
//Epoch: 13 Loss: 0.0
//Epoch: 14 Loss: 0.0
//Epoch: 15 Loss: 0.0
//Epoch: 16 Loss: 0.0
//Epoch: 17 Loss: 0.0
//Epoch: 18 Loss: 0.0
//Epoch: 19 Loss: 0.0
//Epoch: 20 Loss: 0.0
//Predicted [1.0, 0.0, 0.0, 0.0]
//Actual [1.0, 0.0, 0.0, 0.0]
//Weights [-0.1801202881023121, -0.34806144229669855]
//Bias 0.10000000000000014