package org.example.common;

import org.example.utils.Neuronable;

public class SigmoidNeuron implements Neuronable {

    private final double[] weights;

    public SigmoidNeuron(int size) {
        this.weights = new double[size];
        for (int i = 0; i < size; i++) {
            this.weights[i] = 1.0;
        }
    }

    @Override
    public double[] getWeights() {
        return this.weights;
    }

    @Override
    public double getOutput(double[] input) throws NeuronException {
        if (input.length == this.weights.length) {
            double output = 0.0;
            for (int i = 0; i < this.weights.length; i++) {
                output += input[i] * this.weights[i];
            }
            return 1 / (1 + Math.exp(output));
        } else {
            throw new NeuronException("Neuron input and weights' size differs. " +
                    "Input length = " + input.length + ". " +
                    "Weight length = " + this.weights.length);
        }
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.weights.length; i++) {
            result += this.weights[i] + ",";
        }
        result.replaceFirst(".$","");
        result += "]";
        return result;
    }

}