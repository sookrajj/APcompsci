package Q4.prog7301m;

public class layer {
    class neuron {
        public double[] weights;
        public double bias;
        public double value;
        public double delta;

        public neuron(int prevlayersize) {
            weights = new double[prevlayersize];
            bias = Math.random() - .5;
            value = Math.random() - .5;
            delta = Math.random() - .5;
            for (int i = 0; i < weights.length; i++) {
                weights[i] = Math.random() - .5;
            }
        }
    }
    public neuron[] neurons;
    public int size;

    public layer(int Neurons, int prevlayersize) {
        size = Neurons;
        neurons = new neuron[size];
        for (int i = 0; i < size; i++) {
            neurons[i] = new neuron(prevlayersize);
        }
    }

}
