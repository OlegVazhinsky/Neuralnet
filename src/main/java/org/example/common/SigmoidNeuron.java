package org.example.common;

import org.example.utils.Neuronable;

public class SigmoidNeuron implements Neuronable {

    private final int size;
    private final double[] weights;

    public SigmoidNeuron(int size) {
        this.size = size;
        this.weights = new double[this.size];
        for (int i = 0; i < size; i++) {
            this.weights[i] = 1.0;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public double[] getWeights() {
        return this.weights;
    }

    @Override
    public double getOutput(double[] input) throws NeuronException {
        if (input.length == getWeights().length) {
            double output = 0.0;
            for (int i = 0; i < getWeights().length; i++) {
                output += input[i] * getWeights()[i];
            }
            return 1 / (1 + Math.exp(output));
        } else {
            throw new NeuronException("Neuron input and weights' size differs. " +
                    "Input length = " + input.length + ". " +
                    "Weight length = " + getWeights().length);
        }
    }
}

