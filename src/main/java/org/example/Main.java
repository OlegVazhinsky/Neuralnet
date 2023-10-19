package org.example;

import org.example.common.SigmoidNeuron;
import org.example.utils.Neuronable;

public class Main {
    public static void main(String[] args) {
        Neuronable sigmoidNeuron = new SigmoidNeuron(3);
        System.out.println(sigmoidNeuron.toString());
    }
}