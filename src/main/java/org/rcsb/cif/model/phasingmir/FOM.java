package org.rcsb.cif.model.phasingmir;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FOM extends SingleRowFloatColumn {
    public FOM(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FOM(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FOM(String name) {
        super(name);
    }
}