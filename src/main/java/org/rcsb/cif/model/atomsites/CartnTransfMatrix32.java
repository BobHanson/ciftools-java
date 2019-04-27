package org.rcsb.cif.model.atomsites;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CartnTransfMatrix32 extends SingleRowFloatColumn {
    public CartnTransfMatrix32(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CartnTransfMatrix32(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CartnTransfMatrix32(String name) {
        super(name);
    }
}