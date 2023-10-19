package org.example.common;

import org.example.utils.Neuronable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class NeuronLayer {
    private List<Neuronable> neuronList;

    public NeuronLayer(int layerSize, String neuronType) {
        if (neuronType.equals("sigmoidNeuron")) {
            this.neuronList = new ArrayList<>();
            for (int i = 0; i < layerSize; i++) {
                //neuronList.add(new SigmoidNeuron());
            }
        }
    }
}
