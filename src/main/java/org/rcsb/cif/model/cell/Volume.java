package org.rcsb.cif.model.cell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Volume extends SingleRowFloatColumn {
    public Volume(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Volume(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Volume(String name) {
        super(name);
    }
}