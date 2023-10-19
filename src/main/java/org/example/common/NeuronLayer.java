package org.example.common;

import org.example.utils.Neuronable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class NeuronLayer {
    private List<Neuronable> neuronList;

    public NeuronLayer() {
        this.neuronList = new ArrayList<>();
    }

    public NeuronLayer(int size) {
        this.neuronList = new ArrayList<>(size);
    }

    public void setNeuron(int index, Neuronable neuron) {
        this.neuronList.set(index, neuron);
    }

    public List<Neuronable> getNeuronLayer() { return this.neuronList; }

}
