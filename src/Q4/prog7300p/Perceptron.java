package Q4.prog7300p;

import java.util.function.Function;

public class Perceptron {
    private double lr;
    private int epochs;
    private double[] weights;
    private double bias;
    private Function<Double, Double> activation;

    private Double unit_step(Double x) {
        return x > 0 ? 1.0 : 0.0;
    }

    public Perceptron(double lr, int epochs) {
        this.lr = lr;
        this.epochs = epochs;
        this.bias = 1;
        this.activation = this::unit_step;
    }

    public double[] getWeights() {return weights;}
    public double getBias() {return bias;}

    public double forward(double[] x) {
        double dp = bias;
        for (int i = 0; i < x.length; i++) {
            dp += x[i] * weights[i];
        }
        return activation.apply(dp);
    }

    public double[] predict(double[][] x_test) {
        double[] predictions = new double[x_test.length];
        for (int i = 0; i < x_test.length; i++) {
            predictions[i] = forward(x_test[i]);
        }
        return predictions;
    }

    public void fit(double[][] x_train, double[] y_train) {
        weights = new double[x_train[0].length];
        for (int i = 0; i < x_train[0].length; i++) {
            weights[i] = Math.random() - 0.5;
        }
        int ns = x_train.length;
        for (int epoch = 0; epoch < epochs; epoch++) {
            double loss = 0;
            for (int i = 0; i < ns; i++) {
                double yp = forward(x_train[i]);
                double error = y_train[i] - yp;
                loss = Math.pow(error, 2);
                for (int j = 0; j < weights.length; j++) {
                    weights[j] += lr * error * x_train[i][j];
                }
                bias += lr * error;
            }
            System.out.println("Epoch: " + (epoch+1) + " Loss: " + (loss/ns));
        }
    }
}
