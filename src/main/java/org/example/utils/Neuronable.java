package org.example.utils;

import org.example.common.NeuronInputSizeException;

import java.util.List;

public interface Neuronable {
    List<Double> getWeights();
    double getOutput(List<Double> input) throws NeuronInputSizeException;
    String toString();
}