package org.rcsb.cif.model.diffrnsource;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Current extends SingleRowFloatColumn {
    public Current(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Current(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Current(String name) {
        super(name);
    }
}