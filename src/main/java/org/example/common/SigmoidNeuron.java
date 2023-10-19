package org.example.common;

import org.example.utils.Neuronable;

import java.util.ArrayList;
import java.util.List;

public class SigmoidNeuron implements Neuronable {

    private List<Double> weights;
    private double output;

    public SigmoidNeuron(int inputSize) {
        this.output = 0.0;
        this.weights = new ArrayList();
        for (int i = 0; i < inputSize; i++) {
            this.weights.add(1.0);
        }
    }

    @Override
    public List<Double> getWeights() {
        return this.weights;
    }

    @Override
    public double getOutput(List<Double> input) throws NeuronInputSizeException {
        if (input.size() == this.weights.size()) {
            for (int i = 0; i < this.weights.size(); i++) {
                this.output += input.get(i) * this.weights.get(i);
            }
            return 1 / (1 + Math.exp(this.output));
        } else {
            throw new NeuronInputSizeException("Neuron's input and weights' size differs. " +
                    "Input length = " + input.size() + ". " +
                    "Weight length = " + this.weights.size());
        }
    }

    public double getOutput() { return this.output; }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Weights = [");
        for (int i = 0; i < this.weights.length; i++) { result.append(this.weights[i] + ","); }
        result.deleteCharAt(result.length() - 1);
        result.append("]. Output = " + this.output);
        return result.toString();
    }
}