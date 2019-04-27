package org.rcsb.cif.model.chemical;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TemperatureDecomposition extends SingleRowFloatColumn {
    public TemperatureDecomposition(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TemperatureDecomposition(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TemperatureDecomposition(String name) {
        super(name);
    }
}