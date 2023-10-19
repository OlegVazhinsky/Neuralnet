package org.example;

import org.example.common.NeuronException;
import org.example.common.SigmoidNeuron;
import org.example.utils.Neuronable;

public class Main {
    public static void main(String[] args) {
        Neuronable sigmoidNeuron = new SigmoidNeuron(3);
        System.out.println(sigmoidNeuron);
        try {
            System.out.println(sigmoidNeuron.getOutput(new double[]{1, 2, 3, 4}));
        } catch (NeuronException e) {
            System.out.println(e.getMessage());
        }
    }
}