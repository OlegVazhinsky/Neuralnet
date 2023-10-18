package org.example.utils;

import org.example.common.NeuronException;

public interface Neuronable {
    int getSize();
    double[] getWeights();
    double getOutput(double[] input) throws NeuronException;
}