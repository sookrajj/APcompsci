package Q4.prog7301m;


import java.io.Serializable;

public class layer implements Serializable {

    static class Neurons implements Serializable {
        public double[] Weights;
        public double Bias;
        public double Value;
        public double Delta;

        public Neurons(int prevlayersize) {
            Weights = new double[prevlayersize];
            Bias = Math.random() - .5;
            Value = Math.random() - .5;
            Delta = Math.random() - .5;
            for (int i = 0; i < Weights.length; i++) {
                Weights[i] = Math.random() - .5;
            }
        }
    }
    public Neurons[] neurons;
    public int size;

    public layer(int Neurons, int prevlayersize) {
        size = Neurons;
        neurons = new Neurons[size];
        for (int i = 0; i < size; i++) {
            neurons[i] = new Neurons(prevlayersize);
        }
    }

}
