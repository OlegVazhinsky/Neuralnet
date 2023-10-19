package org.example.common;

import org.example.utils.Neuronable;

public class SigmoidNeuron implements Neuronable {

    private double[] weights;
    private double output;

    public SigmoidNeuron(int inputSize) {
        this.output = 0.0;
        this.weights = new double[inputSize];
        for (int i = 0; i < inputSize; i++) {
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
            for (int i = 0; i < this.weights.length; i++) {
                this.output += input[i] * this.weights[i];
            }
            return 1 / (1 + Math.exp(this.output));
        } else {
            throw new NeuronException("Neuron's input and weights' size differs. " +
                    "Input length = " + input.length + ". " +
                    "Weight length = " + this.weights.length);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Weights = [");
        for (int i = 0; i < this.weights.length; i++) { result.append(this.weights[i] + ","); }
        result.deleteCharAt(result.length() - 1);
        result.append("]. Output = " + this.output);
        return result.toString();
    }
}