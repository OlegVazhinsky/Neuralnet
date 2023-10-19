package org.example.utils;

import org.example.common.NeuronException;

public interface Neuronable {
    double[] getWeights();
    double getOutput(double[] input) throws NeuronException;
    String toString();
}